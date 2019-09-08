package credit.assessment.creditassessmentservice.integration.runner;

import credit.assessment.creditassessmentservice.integration.ApplicationIntegrationTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
//        glue = {
//        "steps", "cucumber.api.spring"},
        plugin = {"pretty"}, strict = true)
public class RunCukesTest extends ApplicationIntegrationTest {
    @Test
    public void testNothing() {
        Assert.assertEquals(1, 1);
    }
}
