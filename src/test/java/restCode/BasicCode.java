package restCode;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class BasicCode {

	public static void main(String[] args) {

		// given - add all input
		// when - submit the resp
		// then - validate resp

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("").when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("server", "Apache/2.4.18 (Ubuntu)").extract().response()
				.asString();

		System.out.println(response);

		JsonPath js = new JsonPath(response);
		String id = js.getString("place_id");

		System.out.println(id);
	}

}
