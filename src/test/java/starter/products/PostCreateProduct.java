package starter.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostCreateProduct {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST endpoints")
    public String setPostApiEndpoint(){
        return url + "products";
    }

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Name", "Sony PS5");
        requestBody.put("Description", "play has no limits");
        requestBody.put("Price", 299);
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }
    @Step("I set POST invalid endpoints")
    public String setPostApiInvalidEndpoint(){
        return url + "product";
    }
    @Step("I send POST HTTP request invalid")
    public void sendPostHttpRequestInvalid(){
        SerenityRest.given().post(setPostApiEndpoint());
    }
    @Step("I receive valid HTTP response code 400")
    public void validateHttpResponseCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }

}
