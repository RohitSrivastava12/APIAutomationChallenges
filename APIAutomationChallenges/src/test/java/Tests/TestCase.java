package Tests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class TestCase {
	// Hit Authorization server to get access token , via using grant type client
	// credentials (which takes client_id and client_secret)
	// Hit actual API with access token
	public static String baseUrl = "https://rahulshettyacademy.com/oauthapi/";
	public static String access_token;

	public static void main(String[] args) {
		String response = GetCourseDetails();
		JsonPath js = new JsonPath(response);
		// access_token = js.getString("access_token");
		if(js.getString("courses.webAutomation[1].price").equals("4")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Failed");
		}

	}

	public static String GetCourseDetails() {
		String Get_Url = baseUrl + "getCourseDetails";
		access_token = GetAccessToken();
		String response = given().queryParams("access_token", access_token).when().get(Get_Url).asString();
		System.out.println(response);
		return response;
	}

	public static String GetAccessToken() {
		baseUrl = "https://rahulshettyacademy.com/oauthapi/";
		// String access_token;
		String Post_Url = baseUrl + "oauth2/resourceOwner/token";
		String response = given()
				.formParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W").formParams("Scope", "trust")
				.formParams("grant_type", "clientcredentials").when().post(Post_Url).asString();
		System.out.println(response);
		JsonPath js = new JsonPath(response);
		access_token = js.getString("access_token");
		Assert.assertTrue(access_token.length() > 0);
		return access_token;
	}

}
