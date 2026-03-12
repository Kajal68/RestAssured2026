package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.requests.SignUpRequest;

import io.restassured.response.Response;

public class SignUpAPI {

	@Test(description = "Create an account api test ")
	public void signUpTest() {

		SignUpRequest signUpReq = new SignUpRequest.Builder().username("Kj").email("kj11@gmail.com").firstName("Kj123")
				.lastName("pg").password("kj@1234").mobileNumber("1134567890").build();

		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpReq);
		System.out.println(response.asPrettyString());

	}

}
