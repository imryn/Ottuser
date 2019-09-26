package main;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONObject;

public class CreateJsonFile {

	public JSONObject createUser() throws ParseException {
		Date myDate = new Date();
        Timestamp ts=new Timestamp(myDate.getTime());  

		String d = ts.toString();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(d);
		long millis = date.getTime();
		
		JSONObject obj = new JSONObject();
		obj.put("partnerId", 185);
		obj.put("password", "password");
		
		JSONObject user = new JSONObject();
		user.put("objectType", "KalturaOTTUser");
		user.put("username", "xympdpkyymim" + millis);
		user.put("firstName", "xympdpkyymlh");
		user.put("lastName", "1537875168491");
		user.put("email", "qaott2018+xympdpkyymlh1537875168491@gmail.com");
		user.put("address", "xympdpkyymlh fake address");
		user.put("city", "xympdpkyymlh fake city");
		user.put("countryId", 7);
		user.put("externalId", "xympdpkyymlh" + millis);
		
		obj.put("user", user);
				
		return obj;
	}
	
	public JSONObject createFailUser() {
		JSONObject obj = new JSONObject();
		obj.put("partnerId", 185);
		obj.put("password", "password");
		
		JSONObject user = new JSONObject();
		user.put("objectType", 1);
		user.put("username", "xympdpkyymlh1537875168491");
		user.put("firstName", "xympdpkyymlh");
		user.put("lastName", "1537875168491");
		user.put("email", "qaott2018+xympdpkyymlh1537875168491@gmail.com");
		user.put("address", "xympdpkyymlh fake address");
		user.put("city", "xympdpkyymlh fake city");
		user.put("countryId", 7);
		user.put("externalId", "xympdpkyymlh1537875168491");
		
		obj.put("user", user);
		
		return obj;
	}
	
	public JSONObject loginUser() {
		JSONObject obj = new JSONObject();
		obj.put("partnerId", 185);
		obj.put("username", "xympdpkyymim1569490308000");
		obj.put("password", "password");
		obj.put("id", "1226301");
		obj.put("ignoreNull", true);
		obj.put("format", 1);
		obj.put("clientTag", "java:19-08-12");
		obj.put("apiVersion", "5.2.5.13338");

		return obj;
	}
	
	public JSONObject loginFailUser() {
		JSONObject obj = new JSONObject();
		obj.put("partnerId", 185);
		obj.put("username", "imry");
		obj.put("password", "imry12");
		
		return obj;
	}
	
	public JSONObject updateUser() {
		JSONObject obj = new JSONObject();
		obj.put("id", "1226301");
		obj.put("partnerId", 185);

		JSONObject user = new JSONObject();
			
		user.put("objectType","KalturaOTTUser");
		user.put("firstName","imry");
		user.put("lastName","1537875168491");
		user.put("address","xympdpkyythm fake address");

		obj.put("user", user);
		obj.put("ks", "djJ8MTQ4M3yVTqn8IVcHfbeN1ycdzyrRyqXsq4cd_X8vB8TA7WjFgbVCjhP-vVCHewFQXdneEV0TQnOqx6vSFUoXEAgS9pB0U4_htho9KcKR6LT19ROzcam7zfpwXA8-1boTKto86pgAxj-9UnNQfsbbcYt0ORy-Idf4nueBSRsiLDnrBlsTn8-DmTPo5D-5VCs5jhnGJhDBtyOaHX4dPYTTC3E_rc-PAAWKxMlIo3aA-c1-UH3onQ==");
		obj.put("ignoreNull", true);
		obj.put("format", 1);
		obj.put("clientTag", "java:19-08-12");
		obj.put("apiVersion", "5.2.5.13338");	
		
		return obj;
	}
	
	public JSONObject updateFakeUser() {
		JSONObject obj = new JSONObject();
		obj.put("id", "1218244");
		JSONObject user = new JSONObject();
			
		user.put("objectType","KalturaOTTUser");
		user.put("username","xympdpkyymim1537875168432");
		user.put("firstName","xympdpkyymlh");
		user.put("lastName","1537875168491");
		user.put("email","qaott2019+xympdpkyymlh1537875168491@gmail.com");
		user.put("address","xympdpkyythm fake address");
		user.put("city","xympdpkyymlh fake city");
		user.put("countryId",7);
		user.put("zip", "674343");
		user.put("phone", "054329854");
		user.put("affiliateCode", "32432r");
		user.put("externalId", "xympdpkyymlh153787516435");
		user.put("roleIds","32");
		
		JSONObject userType = new JSONObject();
		userType.put("objectType", "KalturaOTTUser");
		userType.put("description", "KalturaOTTUserUpdate");

		
		user.put("userType", userType);
		obj.put("user", user);
			
		
		return obj;
	}
		
}
