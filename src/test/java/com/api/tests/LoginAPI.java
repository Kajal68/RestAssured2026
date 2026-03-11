package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPI {

	// practice code: 1
	@Test(description = "Verify If Login API is working or not")
	public void LoginTest() {

		RestAssured.baseURI = "http://64.227.160.186:8080";

		// Allows you to specify how the request will look like.
		RequestSpecification x = RestAssured.given();
		RequestSpecification y = x.header("Content-Type", "application/json");

		RequestSpecification z = y
				.body("{\r\n" + "  \"username\": \"string\",\r\n" + "  \"password\": \"string\"\r\n" + "}");
		Response response = z.post("/api/auth/login");
		System.out.println(response.asPrettyString());

		Assert.assertEquals(response.getStatusCode(), 200);

	}
}
