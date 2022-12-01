package starter.publicapis;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Entries {

    public Response response;

    public void HitApi(String method, String link){
        if(method.equals("GET")){
            response = SerenityRest.when().get(link);
        }
    }

    public void VStatusCode(int sc){
        SerenityRest.then().statusCode(sc);
    }

    public void VData(String key, int value){
        assertThat(response.body().jsonPath().get(key), greaterThan(value));
    }

}
