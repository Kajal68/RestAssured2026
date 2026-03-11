package restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SimpleTest {
	@Test
	public void testGetUsers() {

		Response response = RestAssured.get("https://dummyjson.com/products");

		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println(response.getBody().asString());

	}

}
