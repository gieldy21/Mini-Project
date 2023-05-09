package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.authentication.Login;
import starter.authentication.Register;
import starter.authentication.UserInfo;

public class AuthenticationSteps {
    @Steps
    Register register;
    @Steps
    Login login;
    @Steps
    UserInfo userinfo;

    @Given("I set POST endpoints register")
    public void setPostApiEndpointRegister() {
        register.setPostApiEndpointRegister();
    }

    @When("I send POST HTTP request register")
    public void sendPostHTTPRequestRegister() {
        register.sendPostHttpRequestRegister();
    }

    @Given("I set POST invalid endpoints register")
    public void setPostApiInvalidEndpointRegister() {
        register.setPostApiInvalidEndpointRegister();
    }

    @When("I send invalid POST HTTP request register")
    public void sendInvalidPostHTTPRequestRegister() {
        register.sendInvalidPostHttpRequestRegister();
    }

    @Given("I set POST endpoints register without Authorazation")
    public void setPostApiEndpointRegisterWithoutAuthorization() {
        register.setPostApiEndpointRegisterWithoutAuthorization();
    }

    @When("I send POST HTTP request register without Authorazation")
    public void sendPostHTTPRequestRegisterWithoutAuthorization() {
        register.sendPostHttpRequestRegisterWithoutAuthorization();
    }


    @Given("I set POST endpoints login")
    public void setPostApiEndpointLogin() {
        login.setPostApiEndpointLogin();
    }

    @When("I send POST HTTP request login")
    public void sendPostHTTPRequestLogin() {
        login.sendPostHttpRequestLogin();
    }
    @Given("I set POST invalid endpoints login")
    public void setPostApiInvalidEndpointLogin() {
        login.setPostApiInvalidEndpointLogin();
    }

    @When("I send invalid POST HTTP request login")
    public void sendInvalidPostHTTPRequestLogin() {
        login.sendInvalidPostHttpRequestLogin();
    }

    @Given("I set POST endpoints login without Authorazation")
    public void setPostApiEndpointLoginWithoutAuthorization() {
        login.setPostApiEndpointLoginWithoutAuthorization();
    }

    @When("I send POST HTTP request login without Authorazation")
    public void sendPostHTTPRequestLoginWithoutAuthorization() {
        login.sendPostHttpRequestLoginWithoutAuthorization();
    }



    @Given("I set GET endpoints user info")
    public void setGetApiEndpointUserInfo() {
        userinfo.setGetApiEndpointUserInfo();
    }

    @When("I send GET HTTP request user info")
    public void sendGetHTTPRequestUserInfo() {
        userinfo.sendGetHttpRequestUserInfo();
    }
    @Given("I set GET invalid endpoints user info")
    public void setGetApiInvalidEndpointUserInfo() {
        userinfo.setGetApiInvalidEndpointUserInfo();
    }

    @When("I send invalid GET HTTP request user info")
    public void sendInvalidGetHTTPRequestUserInfo() {
        userinfo.sendInvalidGetHttpRequestUserInfo();
    }

    @Given("I set GET endpoints user info without Authorazation")
    public void setGetApiEndpointUserInfoWithoutAuthorization() {
        userinfo.setGetApiEndpointUserInfoWithoutAuthorization();
    }
    @When("I send GET HTTP request user info without Authorazation")
    public void sendPostHTTPRequestUserInfoWithoutAuthorization() {
        userinfo.sendGetHttpRequestUserInfoWithoutAuthorization();
    }
    @Then("I receive valid HTTP response code 405")
    public void receiveHTTPResponseCode405(){
        userinfo.validateHttpResponseCode405();
    }
}
