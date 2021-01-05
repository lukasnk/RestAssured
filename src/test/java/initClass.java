import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;

public class initClass {

    @Test
    public void test() {

        get("http://www.google.pl")
                .then()
                .statusCode(200);
    }
}

