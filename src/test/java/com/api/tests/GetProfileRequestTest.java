package com.api.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.requests.LoginRequest;
import com.api.models.responses.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listener.TestListener.class)
public class GetProfileRequestTest {

	@Test(description = "Get profile request api test")
	public void getProfileInfo() {

		AuthService auth = new AuthService();
		Response res = auth.login(new LoginRequest("Kj", "kj@1234"));
		LoginResponse loginres = res.as(LoginResponse.class);
		System.out.println(loginres.getToken());
		UserProfileManagementService userprofile = new UserProfileManagementService();
	}

}
