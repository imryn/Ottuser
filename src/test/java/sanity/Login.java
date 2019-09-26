package sanity;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.API;
import main.CreateJsonFile;

public class Login extends CreateJsonFile{
	API login =  new API("https://rest-eus1.ott.kaltura.com/restful_v5_0/api_v3/service/ottuser/action/login");
	
	@Test
	public void loginExistUser() throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost post = new HttpPost(login.getPostApi());
		String user = loginUser().toString();

		String responseString = login.getResponseFromApi(httpClient, post, user);	

		Assert.assertEquals(responseString.contains("partnerId: 185"), true);
		Assert.assertEquals(responseString.contains("password: password"), true);
	}
	
	@Test
	public void loginFakeUser() throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();	
		HttpPost post = new HttpPost(login.getPostApi());
		String user = loginFailUser().toString();
		
		String responseString = login.getResponseFromApi(httpClient, post, user);
		
		Assert.assertEquals(responseString.contains("Wrong username or password"), true);
	}
}
