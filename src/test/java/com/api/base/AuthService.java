package com.api.base;

import java.util.HashMap;

import com.api.models.requests.SignUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {

	private String BASE_PATH; // "/api/auth/";
	private String option;

	public AuthService() {
		super();
		BASE_PATH = prop.getProperty("base_path");
		option = prop.getProperty("option");
	}

	public Response login(Object payload) {
		return postRequest(payload, BASE_PATH + option);
	}

	public Response signUp(SignUpRequest payload) {
		return postRequest(payload, BASE_PATH + "signup");

	}

	public Response forgotPassword(String email) {

		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", email);
		return postRequest(payload, BASE_PATH + "forgot-password");

	}

	protected String getProperty(String key) {
		return prop.getProperty(key);
	}

}
