package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUp;

public class SignupInUTestStep1 {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Daniel wants to signup on the Utest$")
    public void thanDanielWantsToSignupOnTheUtest() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.theUtestPage());
    }


    @When("^he enters all the fields correctly$")
    public void heEntersAllTheFieldsCorrectly() {
    }

    @Then("^the platform enable the next step$")
    public void thePlatformEnableTheNextStep() {
    }

}
