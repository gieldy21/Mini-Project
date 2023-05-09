package starter.hello;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class Index {

    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET endpoints hello")
    public String setApiEndpointHello(){

        return url + "hello";
    }
    @Step("I send GET HTTP request hello")
    public void sendGetHttpRequestHello(){
        SerenityRest.given()
                .when()
                .get(setApiEndpointHello());
    }
    @Step("I set GET invalid endpoints hello")
    public String setApiInvalidEndpointHello(){

        return url + "helo";
    }
    @Step("I send invalid GET HTTP request hello")
    public void sendInvalidGetHttpRequestHello(){
        SerenityRest.given()
                .when()
                .get(setApiInvalidEndpointHello());
    }
}
