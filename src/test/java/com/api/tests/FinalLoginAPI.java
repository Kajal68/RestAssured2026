package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.requests.LoginRequest;
import com.api.models.responses.LoginResponse;

import io.restassured.response.Response;

public class FinalLoginAPI extends AuthService {

	String user = getProperty("username");
	String pass = getProperty("password");

	@Test(description = "Verify If Login API is working or not")
	public void LoginTest() {

		LoginRequest loginReq = new LoginRequest(user, pass);
		AuthService authService = new AuthService();
		Response response = authService.login(loginReq);
		System.out.println(response.asPrettyString());
		LoginResponse loginRes = response.as(LoginResponse.class);
		System.out.println(loginRes.getToken());
		System.out.println(loginRes.getEmail());
		System.out.println(loginRes.getId());
		System.out.println(loginRes.getType());
		System.out.println(loginRes.getRoles());
		Assert.assertEquals(response.getStatusCode(), 200);

	}
}
