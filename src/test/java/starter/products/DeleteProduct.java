package starter.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProduct {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set DELETE endpoints")
    public String setDeleteEndpoint(){
        return url + "products/12711";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        SerenityRest.given().delete(setDeleteEndpoint());
    }
    @Step("I set DELETE invalid endpoints")
    public String setDeleteInvalidEndpoint(){
        return url + "product/12711";
    }

    @Step("I send invalid DELETE HTTP request")
    public void sendInvalidDeleteHttpRequest(){
        SerenityRest.given().delete(setDeleteInvalidEndpoint());
    }
}
