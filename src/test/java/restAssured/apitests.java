package restAssured;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class apitests {


    @Test
    public void testCall(){
        given().
                when(). get("https://www.zippopotam.us/us/90210").
                then(). assertThat() .statusCode(200);
}

    @Test
    public void testContentType(){
        given().
                when(). get("https://www.zippopotam.us/us/90210").
                then(). assertThat() .contentType(ContentType.JSON);
    }
    @Test
    public void testLogs(){
        given(). log().all().
                when(). get("https://www.zippopotam.us/us/90210").
                then().log().body();
    }
    @Test
    public void testLogsEntry(){
        given().
                when(). get("https://www.zippopotam.us/us/90210").
                then().assertThat().body("places[0].'place name'", equalTo("Beverly Hills"));
    }
}
