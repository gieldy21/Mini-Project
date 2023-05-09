package starter.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllProducts {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET endpoints")
    public String setApiEndpoint(){

        return url + "products";
    }
    @Step("I send GET HTTP request")
    public void sendGetHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I set GET invalid endpoints")
    public String setApiInvalidEndpoint(){

        return url + "product";
    }
    @Step("I send GET HTTP request invalid")
    public void sendGetHttpRequestInvalid(){
        SerenityRest.given()
                .when()
                .get(setApiInvalidEndpoint());
    }

    @Step("I receive valid HTTP response code 404")
    public void validateHttpResponseCode404(){

        restAssuredThat(response -> response.statusCode(404));
    }
}
