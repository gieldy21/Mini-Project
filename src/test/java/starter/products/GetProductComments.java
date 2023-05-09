package starter.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetProductComments {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step(" I set GET endpoints to get comment")
    public String setApiEndpointComment(){

        return url + "products/11350/comments";
    }
    @Step("I send GET HTTP request to get comment")
    public void sendGetHttpRequestComment(){
        SerenityRest.given()
                .when()
                .get(setApiEndpointComment());
    }
    @Step("I set GET invalid endpoints to get comment")
    public String setApiInvalidEndpointComment(){

        return url + "products/11350/comment";
    }
    @Step("I send invalid GET HTTP request to get comment")
    public void sendInvalidGetHttpRequestComment(){
        SerenityRest.given()
                .when()
                .get(setApiInvalidEndpointComment());
    }
}
