package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.order.GetAllOrders;
import starter.order.GetOrderID;
//import starter.order.PostCreateOrder;

public class OrderSteps {

//    @Steps
//    PostCreateOrder postcreateorder;
    @Steps
    GetAllOrders getallorders;
    @Steps
    GetOrderID getorderid;
//
//    @Given("I set POST endpoints order")
//    public void setPostApiEndpointOrder() {
//        postcreateorder.setPostApiEndpointOrder();
//    }
//
//    @When("I send POST HTTP request order")
//    public void sendPostHTTPRequestOrder() {
//        postcreateorder.sendPostHttpRequestOrder();
//    }
//    @Given("I set POST invalid endpoints order")
//    public void setPostApiInvalidEndpointOrder() {
//        postcreateorder.setPostApiInvalidEndpointOrder();
//    }
//
//    @When("I send invalid POST HTTP request order")
//    public void sendInvalidPostHTTPRequestOrder() {
//        postcreateorder.sendInvalidPostHttpRequestOrder();
//    }
//
//    @Given("I set POST endpoints order without Authorazation")
//    public void setPostApiEndpointOrderWithoutAuthorization() {
//        postcreateorder.setPostApiEndpointOrderWithoutAuthorization();
//    }
//
//    @When("I send POST HTTP request order without Authorazation")
//    public void sendPostHTTPRequestOrderWithoutAuthorization() {
//        postcreateorder.sendPostHttpRequestOrderWithoutAuthorization();
//    }
    @Given("I set GET endpoints orders")
    public void setGetApiEndpointOrders() {
        getallorders.setGetApiEndpointOrders();
    }
    @When("I send GET HTTP request orders")
    public void sendGetHTTPRequestOrders() {
        getallorders.sendGetHttpRequestOrders();
    }
    @Given("I set GET invalid endpoints orders")
    public void setGetApiInvalidEndpointOrders() {
        getallorders.setGetApiInvalidEndpointOrders();
    }

    @When("I send invalid GET HTTP request orders")
    public void sendInvalidGetHTTPRequestOrders() {
        getallorders.sendInvalidGetHttpRequestOrders();
    }

    @Given("I set GET endpoints orders without Authorazation")
    public void setGetApiEndpointOrdersWithoutAuthorization() {
        getallorders.setGetApiEndpointOrdersWithoutAuthorization();
    }
    @When("I send GET HTTP request orders without Authorazation")
    public void sendPostHTTPRequestOrdersWithoutAuthorization() {
        getallorders.sendGetHttpRequestOrdersWithoutAuthorization();
    }



    @Given("I set GET endpoints order id")
    public void setGetApiEndpointOrderID() {
        getorderid.setGetApiEndpointOrderID();
    }
    @When("I send GET HTTP request order id")
    public void sendGetHTTPRequestOrderID() {
        getorderid.sendGetHttpRequestOrderID();
    }
    @Given("I set GET invalid endpoints order id")
    public void setGetApiInvalidEndpointOrderID() {
        getorderid.setGetApiInvalidEndpointOrderID();
    }

    @When("I send invalid GET HTTP request order id")
    public void sendInvalidGetHTTPRequestOrderID() {
        getorderid.sendInvalidGetHttpRequestOrderID();
    }

    @Given("I set GET endpoints order id without Authorazation")
    public void setGetApiEndpointOrderIDWithoutAuthorization() {
        getorderid.setGetApiEndpointOrderIDWithoutAuthorization();
    }
    @When("I send GET HTTP request order id without Authorazation")
    public void sendPostHTTPRequestOrderIDWithoutAuthorization() {
        getorderid.sendGetHttpRequestOrderIDWithoutAuthorization();
    }
}
