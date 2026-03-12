package com.api.base;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService {

	private String BASE_PATH; // "/api/auth/";
	private String option;

	public UserProfileManagementService() {
		super();
		BASE_PATH = prop.getProperty("user_base_path");
		option = prop.getProperty("user_profile");
	}

	public Response getProfile() {
		return getRequest(BASE_PATH + option);
	}
}
