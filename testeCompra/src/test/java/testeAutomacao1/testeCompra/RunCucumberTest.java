package testeAutomacao1.testeCompra;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		 plugin = { "pretty", "html:target/cucumber-reports" },
		 monochrome = false
		 )
public class RunCucumberTest {

}
