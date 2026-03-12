package com.api.base;

import org.testng.annotations.BeforeClass;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.mapper.ObjectMapperType;

public class BaseTeest {
	@BeforeClass
	public void setup() {
		RestAssured.config = RestAssured.config().objectMapperConfig(
				new ObjectMapperConfig(ObjectMapperType.JACKSON_2).jackson2ObjectMapperFactory((cls, charset) -> {
					ObjectMapper mapper = new ObjectMapper();
					mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
					return mapper;
				}));
	}
}
