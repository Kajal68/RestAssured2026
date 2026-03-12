package com.api.base;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService { // wrapper for rest assured

	// Base uri
	// creating the request
	// handling the response
	static Properties prop = new Properties();

	private static String BASE_URL; // "http://64.227.160.186:8080";
	private RequestSpecification reqspec;

	static {
		try (FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\config.properties")) {
			prop.load(fis);
			BASE_URL = prop.getProperty("base_uri");
		} catch (IOException e) {
			throw new RuntimeException("Failed to load properties file", e);
		}
	}

	public BaseService() {

		reqspec = given().baseUri(prop.getProperty("base_uri"));

	}

	protected Response postRequest(Object payload, String endpoint) {

		return reqspec.contentType(ContentType.JSON).body(payload).post(endpoint);
	}

	protected Response putRequest(Object payload, String endpoint) {

		return reqspec.contentType(ContentType.JSON).body(payload).put(endpoint);
	}

	protected Response getRequest(String endpoint) {

		return reqspec.get(endpoint);
	}
}
