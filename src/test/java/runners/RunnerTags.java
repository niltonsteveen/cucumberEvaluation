package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/signupUserInUTestStep1.feature",
        tags = "@stories",
        glue= "co.com.evaluation.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
    public static  void main(String[]args){

    }
}
