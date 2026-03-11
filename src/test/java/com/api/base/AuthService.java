package com.api.base;

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

	protected String getProperty(String key) {
		return prop.getProperty(key);
	}

}
