package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGetAIPs12 {

	@Test
	public void testListOfAllObjects() {
		RestAssured.baseURI = "https://api.restful-api.dev/objects";
		RequestSpecification req = RestAssured.given();
		Response res = req.get();
		System.out.println(res.body().asString());
		String name = res.jsonPath().getString("name");
		System.out.println(name.split((","))[7]);
	}

}
