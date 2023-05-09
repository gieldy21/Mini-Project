package starter.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class PostCreateComment {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST endpoints comment for product")
    public String setPostApiEndpointComment(){
            return url + "products/11350/comments";
        }
    @Step("I send POST HTTP request comment for product")
        public void sendPostHttpRequestComment(){
            JSONObject requestBody = new JSONObject();
            requestBody.put("Content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");
            SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointComment());
        }
    @Step("I set POST invalid endpoints comment for product")
    public String setPostApiInvalidEndpointComment(){
        return url + "products/11350/comment";
    }
    @Step("I send invalid POST HTTP request comment for product")
    public void sendInvalidPostHttpRequestComment(){
        SerenityRest.given().post(setPostApiInvalidEndpointComment());
    }
    @Step("I set POST endpoints comment without Authorization")
    public String setPostApiEndpointCommentWithAuthorization(){
        return url + "products/11350/comments";
    }
    @Step("I send POST HTTP request comment without Authorization")
    public String sendPostHttpRequestCommentWithoutAuthorization(){
        SerenityRest.given().post(setPostApiEndpointComment());
        return null;
    }
}
