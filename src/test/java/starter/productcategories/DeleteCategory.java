package starter.productcategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteCategory {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set DELETE endpoints category")
    public String setDeleteEndpointCategory(){
        return url + "categories/12482";
    }

    @Step("I send DELETE HTTP request category")
    public void sendDeleteHttpRequestCategory(){
        SerenityRest.given().delete(setDeleteEndpointCategory());
    }
    @Step("I set DELETE invalid endpoints category")
    public String setDeleteInvalidEndpointCategory(){
        return url + "categorie/12482";
    }

    @Step("I send invalid DELETE HTTP request category")
    public void sendInvalidDeleteHttpRequestCategory(){
        SerenityRest.given().delete(setDeleteInvalidEndpointCategory());
    }
}
