package starter.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetProductRating {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step(" I set GET endpoints to get rating")
    public String setApiEndpointRating(){

        return url + "products/11350/ratings";
    }
    @Step("I send GET HTTP request to get rating")
    public void sendGetHttpRequestRating(){
        SerenityRest.given()
                .when()
                .get(setApiEndpointRating());
    }
    @Step("I set GET invalid endpoints to get rating")
    public String setApiInvalidEndpointRating(){

        return url + "products/11350/rating";
    }
    @Step("I send invalid GET HTTP request to get rating")
    public void sendInvalidGetHttpRequestRating(){
        SerenityRest.given()
                .when()
                .get(setApiInvalidEndpointRating());
    }
}
