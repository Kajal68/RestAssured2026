package com.api.tests;

// improve readability
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class RealLoginAPI {
	// practice code : 2

	@Test(description = "Verify If Login API is working or not")
	public void LoginTest() {

		// baseURI = "http://64.227.160.186:8080";

		// Allows you to specify how the request will look like.

		Response response = given().baseUri("http://64.227.160.186:8080").header("Content-Type", "application/json")
				.body("{\r\n" + "  \"username\": \"string\",\r\n" + "  \"password\": \"string\"\r\n" + "}")
				.post("/api/auth/login");
		System.out.println(response.asPrettyString());

		Assert.assertEquals(response.getStatusCode(), 200);

	}
}
