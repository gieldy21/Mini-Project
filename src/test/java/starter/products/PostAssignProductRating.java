package starter.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import sun.security.krb5.internal.AuthorizationData;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostAssignProductRating {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST endpoints assign a product rating")
    public String setPostApiEndpointAssignRating(){
        return url + "products/13684/ratings";
    }

    @Step("I send POST HTTP request assign a product rating")
    public void sendPostHttpRequestAssignRating(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Count", 4);
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointAssignRating());
    }
    @Step("I set POST invalid endpoints assign a product rating")
    public String setPostApiInvalidEndpointAssignRating(){
        return url + "products/13684/rating";
    }
    @Step("I send invalid POST HTTP request assign a product rating")
    public void sendInvalidPostHttpRequestAssignRating(){
        SerenityRest.given().post(setPostApiInvalidEndpointAssignRating());
    }
    @Step("I set POST endpoints assign a product rating.")
    public String setPostApiEndpointAssignRatingWithAuthorization(){
        return url + "products/13222/ratings";
    }
    @Step("I send POST HTTP request assign a product rating without Authorazation")
    public String sendPostHttpRequestAssignRatingWithoutAuthorization(){
        SerenityRest.given().post(setPostApiEndpointAssignRating());
        return null;
    }
    @Step("I receive valid HTTP response code 401")
    public void validateHttpResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
