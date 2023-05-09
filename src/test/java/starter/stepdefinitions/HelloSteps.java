package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.hello.Index;

public class HelloSteps {
    @Steps
    Index index;

    @Given("I set GET endpoints hello")
    public void setGetApiEndpoint(){

        index.setApiEndpointHello();
    }
    @When("I send GET HTTP request hello")
    public void sendGetHttpRequestHello(){

        index.sendGetHttpRequestHello();
    }
    @Given("I set GET invalid endpoints hello")
    public void setGetApiInvalidEndpointHello(){

        index.setApiInvalidEndpointHello();
    }
    @When("I send invalid GET HTTP request hello")
    public void sendInvalidGetHttpRequestHello(){

        index.sendInvalidGetHttpRequestHello();
    }
}
