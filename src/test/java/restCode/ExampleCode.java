package restCode;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ExampleCode {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://dummyjson.com/products";

		// given().log().all()

		Response response = RestAssured.given().queryParam("q", "phone").get("https://dummyjson.com/products/search");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());

	}

}
