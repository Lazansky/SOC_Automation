package BDD_Cucumber.BDD_CucumberFramework;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\Feature", glue={"BDD_Cucumber.BDD_CucumberFramework"},
plugin = {"pretty", "html:target/HtmlReports"}
)
public class TestRunner {

}
