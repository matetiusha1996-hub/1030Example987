package tests;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGetAIPs8 {

	@Test
	public void testListOfAllObjects() {
		RestAssured.baseURI = "https://api.restful-api.dev/objects";
		RequestSpecification req = RestAssured.given();
		Map<String,String> header=new HashMap<String,String>();
		header.put("x-api-key", "YOUR_API_KEY");
		//header.put("Authorization", "bearer jdhe4hehdj6t6kk7j7n7j6k");
		Response res = req.get();
		System.out.println(res.cookies());
		System.out.println(res.getStatusCode());
		

	}

}
