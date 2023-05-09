package starter.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductById {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET endpoints By ID")
    public String setApiEndpointByID(){

        return url + "products/13684";
    }
    @Step("I send GET HTTP request By ID")
    public void sendGetHttpRequestByID(){
        SerenityRest.given()
                .when()
                .get(setApiEndpointByID());
    }

    @Step("I set GET invalid endpoints By ID")
    public String setApiInvalidEndpointByID(){

        return url + "product/13684";
    }
    @Step("I send invalid GET HTTP request By ID")
    public void sendInvalidGetHttpRequestByID(){
        SerenityRest.given()
                .when()
                .get(setApiInvalidEndpointByID());
    }
}
