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
		obj.put("username", "xympdpkyymim1568810420000");
		obj.put("password", "password");
		
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
		obj.put("id", "1218238");
		JSONObject user = new JSONObject();
			
		user.put("objectType","KalturaOTTUser");
		user.put("username","xympdpkyymim1537875168491");
		user.put("firstName","xympdpkyymlh");
		user.put("lastName","1537875168491");
		user.put("email","qaott2019+xympdpkyymlh1537875168491@gmail.com");
		user.put("address","xympdpkyythm fake address");
		user.put("city","xympdpkyymlh fake city");
		user.put("countryId",7);
		user.put("zip", "674343");
		user.put("phone", "054329854");
		user.put("affiliateCode", "32432r");
		user.put("externalId", "xympdpkyymlh1537875168491");
		user.put("roleIds","1");
		
		JSONObject userType = new JSONObject();
		userType.put("objectType", "KalturaOTTUser");
		userType.put("description", "KalturaOTTUserUpdate");
		
		user.put("userType", userType);
		obj.put("user", user);
			
		
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
