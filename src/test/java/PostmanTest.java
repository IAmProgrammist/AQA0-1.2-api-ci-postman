import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    public void makePostmanTest(){
        given()
                .baseUri("https://postman-echo.com")
                .body("I like potato!")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("I like potato!"));
    }

}
