package starter.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Register {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST endpoints register")
    public String setPostApiEndpointRegister(){
        return url + "auth/register";
    }

    @Step("I send POST HTTP request register")
    public void sendPostHttpRequestRegister(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "TestingGieldy111@mail.com");
        requestBody.put("Password", "test123");
        requestBody.put("Fullname", "Test Giel");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }
    @Step("I set POST invalid endpoints register")
    public String setPostApiInvalidEndpointRegister(){
        return url + "register";
    }
    @Step("I send invalid POST HTTP request register")
    public void sendInvalidPostHttpRequestRegister(){
        SerenityRest.given().post(setPostApiInvalidEndpointRegister());
    }
    @Step("I set POST endpoints register without Authorazation")
    public String setPostApiEndpointRegisterWithoutAuthorization(){
        return url + "auth/register";
    }
    @Step("I send POST HTTP request register without Authorazation")
    public String sendPostHttpRequestRegisterWithoutAuthorization(){
        SerenityRest.given().post(setPostApiEndpointRegisterWithoutAuthorization());
        return null;
    }
}
