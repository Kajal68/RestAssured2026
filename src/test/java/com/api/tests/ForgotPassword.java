package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPassword {

	@Test(description = "Forgot password ")
	public void ForgotPasswordTest() {

		AuthService auth = new AuthService();
		Response res = auth.forgotPassword("kj1234@gmail.com");
		System.out.println(res.asPrettyString());
	}

}
