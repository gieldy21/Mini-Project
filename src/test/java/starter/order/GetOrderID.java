package starter.order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetOrderID {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET endpoints order id")
    public String setGetApiEndpointOrderID(){
        return url + "orders/10277";
    }

    @Step("I send GET HTTP request order id")
    public void sendGetHttpRequestOrderID(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setGetApiEndpointOrderID());
    }
    @Step("I set GET invalid endpoints order id")
    public String setGetApiInvalidEndpointOrderID(){
        return url + "order";
    }
    @Step("I send invalid GET HTTP request order id")
    public void sendInvalidGetHttpRequestOrderID(){
        SerenityRest.given().post(setGetApiInvalidEndpointOrderID());
    }
    @Step("I set GET endpoints order id without Authorazation")
    public String setGetApiEndpointOrderIDWithoutAuthorization(){
        return url + "orders/10277";
    }
    @Step("I send GET HTTP request order id without Authorazation")
    public String sendGetHttpRequestOrderIDWithoutAuthorization(){
        SerenityRest.given().post(setGetApiEndpointOrderIDWithoutAuthorization());
        return null;
    }
}
