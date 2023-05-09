package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.products.*;

public class ProductSteps {
    @Steps
    GetAllProducts getallproducts;
    @Steps
    PostCreateProduct postcreateproduct;
    @Steps
    GetProductById getproductbyid;
    @Steps
    DeleteProduct deleteproduct;
    @Steps
    PostAssignProductRating postAssignProductRating;
    @Steps
    GetProductRating getproductrating;
    @Steps
    PostCreateComment postcreatecomment;
    @Steps
    GetProductComments getproductcomments;


    @Given("I set GET endpoints")
    public void setGetApiEndpoint(){

        getallproducts.setApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){

        getallproducts.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){

        getallproducts.validateHttpResponseCode200();
    }

    @Given("I set GET invalid endpoints")
    public void setGetApiInvalidEndpoint(){

        getallproducts.setApiEndpoint();
    }
    @When("I send GET HTTP request invalid")
    public void sendGetHttpRequestInvalid(){

        getallproducts.sendGetHttpRequestInvalid();
    }
    @Then("I receive valid HTTP response code 404")
    public void receiveInvalidHttpResponseCode(){

        getallproducts.validateHttpResponseCode404();
    }





    @Given("I set POST endpoints")
    public void setPostApiEndpoint(){
        postcreateproduct.setPostApiEndpoint();
    }
    @When("I send POST HTTP request")
    public void sendPostHTTPRequest(){
        postcreateproduct.sendPostHttpRequest();
    }

    @Given("I set POST invalid endpoints")
    public void setPostcreateproduct(){
        postcreateproduct.setPostApiInvalidEndpoint();
    }
    @When("I send POST HTTP request invalid")
    public void sendPostHTTPRequestInvalid(){
        postcreateproduct.sendPostHttpRequestInvalid();
    }
    @Then("I receive valid HTTP response code 400")
    public void receiveInvalidHTTPResponseCode400(){
        postcreateproduct.validateHttpResponseCode400();
    }




    @Given("I set GET endpoints By ID")
    public void setGetApiEndpointByID(){
        getproductbyid.setApiEndpointByID();
    }
    @When("I send GET HTTP request By ID")
    public void sendGetHTTPRequestByID(){
        getproductbyid.sendGetHttpRequestByID();
    }

    @Given("I set GET invalid endpoints By ID")
    public void setGetApiInvalidEndpointByID(){
        getproductbyid.setApiInvalidEndpointByID();
    }
    @When("I send invalid GET HTTP request By ID")
    public void sendInvalidGetHTTPRequestByID(){
        getproductbyid.sendInvalidGetHttpRequestByID();
    }



    @Given("I set DELETE endpoints")
    public void setDeleteEndpoint(){
        deleteproduct.setDeleteEndpoint();
    }
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        deleteproduct.sendDeleteHttpRequest();
    }
    @Given("I set DELETE invalid endpoints")
    public void setDeleteInvalidEndpoint(){
        deleteproduct.setDeleteInvalidEndpoint();
    }
    @When("I send invalid DELETE HTTP request")
    public void sendInvalidDeleteHttpRequest(){
        deleteproduct.sendInvalidDeleteHttpRequest();
    }



    @Given("I set POST endpoints assign a product rating")
    public void setPostApiEndpointAssignRating(){
        postAssignProductRating.setPostApiEndpointAssignRating();
    }
    @When("I send POST HTTP request assign a product rating")
    public void sendPostHTTPRequestAssignRating(){
        postAssignProductRating.sendPostHttpRequestAssignRating();
    }
    @Given("I set POST invalid endpoints assign a product rating")
    public void setPostApiInvalidEndpointAssignRating(){
        postAssignProductRating.setPostApiInvalidEndpointAssignRating();
    }
    @When("I send invalid POST HTTP request assign a product rating")
    public void sendInvalidPostHTTPRequestAssignRating(){
        postAssignProductRating.sendInvalidPostHttpRequestAssignRating();
    }
    @Given("I set POST endpoints assign a product rating.")
    public void setPostApiEndpointAssignRatings(){
        postAssignProductRating.setPostApiEndpointAssignRatingWithAuthorization();
    }
    @When("I send POST HTTP request assign a product rating without Authorazation")
    public void sendPostHTTPRequestAssignRatingWithoutAuthorization(){
        postAssignProductRating.sendPostHttpRequestAssignRatingWithoutAuthorization();
    }
    @Then("I receive valid HTTP response code 401")
    public void receiveHTTPResponseCode401(){
        postAssignProductRating.validateHttpResponseCode401();
    }



    @Given("I set GET endpoints to get rating")
    public void setGetApiEndpointRating(){
        getproductrating.setApiEndpointRating();
    }
    @When("I send GET HTTP request to get rating")
    public void sendGetHTTPRequestRating(){
        getproductrating.sendGetHttpRequestRating();
    }
    @Given("I set GET invalid endpoints to get rating")
    public void setGetApiInvalidEndpointRating(){
        getproductrating.setApiInvalidEndpointRating();
    }
    @When("I send invalid GET HTTP request to get rating")
    public void sendInvalidGetHTTPRequestRating(){
        getproductrating.sendInvalidGetHttpRequestRating();
    }



    @Given("I set POST endpoints comment for product")
    public void setPostApiEndpointComment(){
        postcreatecomment.setPostApiEndpointComment();
    }
    @When("I send POST HTTP request comment for product")
    public void sendPostHTTPRequestComment(){
        postcreatecomment.sendPostHttpRequestComment();
    }
    @Given("I set POST invalid endpoints comment for product")
    public void setPostApiInvalidEndpointComment(){
        postcreatecomment.setPostApiInvalidEndpointComment();
    }
    @When("I send invalid POST HTTP request comment for product")
    public void sendInvalidPostHTTPRequestComment(){
        postcreatecomment.sendInvalidPostHttpRequestComment();
    }
    @Given("I set POST endpoints comment without Authorization")
    public void setPostApiEndpointCommentWithAuthorization(){
        postcreatecomment.setPostApiEndpointCommentWithAuthorization();
    }
    @When("I send POST HTTP request comment without Authorization")
    public void sendPostHTTPRequestCommentWithoutAuthorization(){
        postcreatecomment.sendPostHttpRequestCommentWithoutAuthorization();
    }



    @Given("I set GET endpoints to get comment")
    public void setGetApiEndpointComment(){
        getproductcomments.setApiEndpointComment();
    }
    @When("I send GET HTTP request to get comment")
    public void sendGetHTTPRequestComment(){
        getproductcomments.sendGetHttpRequestComment();
    }
    @Given("I set GET invalid endpoints to get comment")
    public void setGetApiInvalidEndpointComment(){
        getproductcomments.setApiInvalidEndpointComment();
    }
    @When("I send invalid GET HTTP request to get comment")
    public void sendInvalidGetHTTPRequestComment(){
        getproductcomments.sendInvalidGetHttpRequestComment();
    }
}
