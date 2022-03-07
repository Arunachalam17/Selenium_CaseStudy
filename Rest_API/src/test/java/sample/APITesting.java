package sample;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class APITesting {

	// If Sun.security certificate error occurs
	
	  
	  @BeforeClass
	  public void bf()
	  { 
		  RestAssured.useRelaxedHTTPSValidation();
		  
		  }
	  
	 

	@Test
	public void get_method() {
		
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[3]", equalTo(10))
		.body("data.first_name", hasItem("Tobias"));	


	}
	
	@DataProvider (name="data-provider1")
	public Object[][] post_method_data(){
		return new Object[][] {
			{"arundurai" , "leader"},
			{"kumar", "singer"},
			{"vivek", "dancer"},
			{"babu", "tech"},
			{"sandy","QA"}
			};
	}
	
	@Test (dataProvider = "data-provider1")
	public void post_method(String val1, String val2) {
		
	JSONObject j1 = new JSONObject();
		
		j1.put(val1,val2);		
		
		System.out.println(j1.toJSONString());
		given().
		body(j1.toJSONString()).
		post("https://reqres.in/api/users").
		then().statusCode(201);
	}
	
	@Test
	public void put_method() {
		
		JSONObject j2 = new JSONObject();
		
		j2.put("name", "arun");
		j2.put("job", "dancer");
		
		System.out.println(j2.toJSONString());
		given().
		body(j2.toJSONString()).
		post("https://reqres.in/api/users/2").
		then().statusCode(201);
		
		
	}
	
	
	  @Test 
	  public void delete_method() {
	  
	  given().
	  get("https://reqres.in/api/users/2").
	  then(). statusCode(204);
	  }
	 
	
}
