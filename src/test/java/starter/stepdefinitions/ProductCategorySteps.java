package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.productcategories.DeleteCategory;
import starter.productcategories.GetAllCategory;
import starter.productcategories.GetCategoryByID;
import starter.productcategories.PostCreateCategory;

public class ProductCategorySteps {
    @Steps
    PostCreateCategory postcreatecategory;
    @Steps
    GetCategoryByID getcategorybyid;
    @Steps
    GetAllCategory getallcategory;
    @Steps
    DeleteCategory deletecategory;

    @Given("I set POST endpoints categories")
    public void setPostApiEndpointCategories(){
        postcreatecategory.setPostApiEndpointCategories();
    }
    @When("I send POST HTTP request categories")
    public void sendPostHTTPRequestCategories(){
        postcreatecategory.sendPostHttpRequestCategories();
    }
    @When("I send empty POST HTTP request categories")
    public void sendEmptyPostHTTPRequestCategories(){
        postcreatecategory.sendEmptyPostHttpRequestCategories();
    }
    @Given("I set POST invalid endpoints categories")
    public void setPostApiInvalidEndpointCategories(){
        postcreatecategory.setPostApiInvalidEndpointCategories();
    }
    @When("I send invalid POST HTTP request categories")
    public void sendPostHTTPRequestInvalidCategories(){
        postcreatecategory.sendPostHttpRequestInvalidCategories();
    }


    @Given("I set GET endpoints category By ID")
    public void setGetApiEndpointCategoriesByID(){
        getcategorybyid.setApiEndpointCategoryByID();
    }
    @When("I send GET HTTP request category By ID")
    public void sendGetHTTPRequestCategoriesByID(){
        getcategorybyid.sendGetHttpRequestCategoryByID();
    }
    @Given("I set GET invalid endpoints category By ID")
    public void setGetApiInvalidEndpointCategoriesByID(){
        getcategorybyid.setApiInvalidEndpointCategoryByID();
    }
    @When("I send invalid GET HTTP request category By ID")
    public void sendGetHTTPRequestInvalidCategoriesByID(){
        getcategorybyid.sendInvalidGetHttpRequestCategoryByID();
    }


    @Given("I set GET endpoints to all category")
    public void setGetApiEndpointAllCategory(){
        getallcategory.setApiEndpointAllCategory();
    }
    @When("I send GET HTTP request to all category")
    public void sendGetHTTPRequestAllCategory(){
        getallcategory.sendGetHttpRequestAllCategory();
    }
    @Given("I set GET invalid endpoints to all category")
    public void setGetApiInvalidEndpointAllCategory(){
        getallcategory.setApiInvalidEndpointAllCategory();
    }
    @When("I send invalid GET HTTP request to all category")
    public void sendInvalidGetHTTPRequestAllCategory(){
        getallcategory.sendInvalidGetHttpRequestAllCategory();
    }


    @Given("I set DELETE endpoints category")
    public void setDeleteEndpointCategory(){
        deletecategory.setDeleteEndpointCategory();
    }
    @When("I send DELETE HTTP request category")
    public void sendDeleteHttpRequestCategory(){
        deletecategory.sendDeleteHttpRequestCategory();
    }
    @Given("I set DELETE invalid endpoints category")
    public void setDeleteInvalidEndpointCategory(){
        deletecategory.setDeleteInvalidEndpointCategory();
    }
    @When("I send invalid DELETE HTTP request category")
    public void sendInvalidDeleteHttpRequestCategory(){
        deletecategory.sendInvalidDeleteHttpRequestCategory();
    }
}
