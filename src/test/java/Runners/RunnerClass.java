package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files
        features = "src/test/resources/features/Login.feature",
        //glue is where we find implementations for gherkin steps
        //we provide the path of package where we defined all the steps
        glue = "steps",
        //if we set it to true, it will quickly scan all gherkin steps whether they are implemented or not
        //if it is set to true, it stops actual execution
        dryRun = false

)


public class RunnerClass {
}
