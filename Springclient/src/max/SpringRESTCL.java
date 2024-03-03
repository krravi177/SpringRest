package max;

import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;

public class SpringRESTCL {
	public static void getD(int uid) throws JSONException {
		
	RestTemplate restT = new RestTemplate();
	String url="http://localhost:8080/SpringrestServer/ok.do?uid="+uid;
	  HttpHeaders header = new HttpHeaders();
	 // header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	  header.setContentType(MediaType.APPLICATION_JSON);
	  
	   HttpEntity<String> entity = new  HttpEntity<String>(header);
	   
	  ResponseEntity<String> data = restT.exchange(url, HttpMethod.GET, entity, String.class);
	 String d = data.getBody();
	
	 JSONArray ja = new JSONArray(d);
	for(int i=0; i<ja.length();i++)
	{
		JSONObject t = ja.getJSONObject(i);
		System.out.println(t.getString("uid")+" "+t.getString("name")+" "+t.getString("add"));
	}
	 
	 System.out.println(d);
	}
	
	public static void main(String[] args) throws JSONException {
		SpringRESTCL.getD(200);
	}

}
