package main;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

public class API {
	public String postApi;
	
	public API(String postApi) {
		this.postApi = postApi;
	}
	
	public static Map<String, String> getHeaders() { 
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("accept", "application/json");
	    params.put("Content-Type", "application/json");
	    return params; 
	}

	public String getPostApi() {
		return postApi;
	}
	
	public String getResponseFromApi(CloseableHttpClient httpClient, HttpPost post, String user) throws UnsupportedEncodingException {
		post.setEntity(new StringEntity(user));
		
		for(Map.Entry<String, String> entry: API.getHeaders().entrySet()) {
			post.addHeader(entry.getKey(), entry.getValue());
		}
		
		CloseableHttpResponse closeableHttpResponse;
		try {
			closeableHttpResponse = httpClient.execute(post);
			HttpEntity entity = closeableHttpResponse.getEntity();
			String responseString = EntityUtils.toString(entity, "UTF-8");
			return responseString;
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "response from api does not work";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "response from api does not work";
		}
		
		
	}
}
