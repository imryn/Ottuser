package sanity;

import java.io.UnsupportedEncodingException;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.API;
import main.CreateJsonFile;

public class Update extends CreateJsonFile{
	API update = new API("https://rest-eus1.ott.kaltura.com/restful_v5_0/api_v3/service/ottuser/action/update");
	
	@Test
	public void updateExistUser() throws UnsupportedEncodingException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost post = new HttpPost(update.getPostApi());
		String user = updateUser().toString();

		String responseString = update.getResponseFromApi(httpClient, post, user);
		Assert.assertEquals(responseString.contains("login"), true);
	}
	
	@Test
	public void updateNonExistUser() throws UnsupportedEncodingException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost post = new HttpPost(update.getPostApi());
		String user = updateFakeUser().toString();

		String responseString = update.getResponseFromApi(httpClient, post, user);
				
		Assert.assertEquals(responseString.contains("Invalid action parameter [user]"), true);
	}
}
