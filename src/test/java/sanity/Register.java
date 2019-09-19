package sanity;

import java.io.IOException;
import java.text.ParseException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.API;
import main.CreateJsonFile;

public class Register extends CreateJsonFile{
	API reg = new API("https://rest-eus1.ott.kaltura.com/restful_v5_0/api_v3/service/ottuser/action/register");
	
	@Test
	public void registerUser() throws IOException, ParseException {

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost post = new HttpPost(reg.getPostApi());
		String user = createUser().toString();
		
		String responseString = reg.getResponseFromApi(httpClient, post, user);
		Assert.assertEquals(responseString.contains("description"), true);
  }
	
	@Test(dependsOnMethods = {"registerUser"})
	public void failRegisterUser() throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();	
		HttpPost post = new HttpPost(reg.getPostApi());
		String user = createFailUser().toString();
		
		String responseString = reg.getResponseFromApi(httpClient, post, user);
		
		Assert.assertEquals(responseString.contains("Invalid object type [1]"), true);
	}
}
