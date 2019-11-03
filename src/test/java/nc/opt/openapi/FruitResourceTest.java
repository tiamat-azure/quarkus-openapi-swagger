package nc.opt.openapi;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class FruitResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/C:/Program Files/Git/fruits")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}