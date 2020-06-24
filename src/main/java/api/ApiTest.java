package api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class ApiTest {


    @Test()
    public void getTest() {

        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .log().all()
                .statusCode(200)
                .body("page", notNullValue())
                .body("per_page", notNullValue())
                .body("total", notNullValue())
                .body("total_pages", notNullValue())
                .body("data.id", not(hasItem(nullValue())))
                .body("data.email", not(hasItem(nullValue())))
                .body("data.first_name", not(hasItem(nullValue())))
                .body("data.last_name", not(hasItem(nullValue())))
                .body("data.avatar", not(hasItem(nullValue())))
                .body("ad.company", notNullValue())
                .body("ad.url", notNullValue())
                .body("ad.text", notNullValue());
    }

    @Test
    public void postTest(){

        Map<String, String> data = new HashMap<>();

        data.put("name", "Arthas Menethil");
        data.put("job", "Reign of Chaos");

        Response response = given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log().all()
                .statusCode(201)
                .extract()
                .response();

        JsonPath jsonResponse = response.jsonPath();

        Assert.assertEquals(jsonResponse.get("name").toString(), data.get("name"));
        Assert.assertEquals(jsonResponse.get("job").toString(), data.get("job"));
    }

}
