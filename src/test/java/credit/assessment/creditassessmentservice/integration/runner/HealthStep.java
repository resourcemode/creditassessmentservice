package credit.assessment.creditassessmentservice.integration.runner;

import credit.assessment.creditassessmentservice.integration.ApplicationIntegrationTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONObject;
import org.junit.Assert;

public class HealthStep extends ApplicationIntegrationTest {
    @When("^the client calls \"([^\"]*)\"$")
    public void the_client_calls(String url) {
        get(url);
    }

    @Then("^the client receives status code of \"([^\"]*)\"$")
    public void the_client_receives_status_code_of(String code) {
        Integer responseCode = response.getStatusCodeValue();
        Assert.assertEquals(code, responseCode.toString());
    }

    @Then("^the client receives  status response \"([^\"]*)\"$")
    public void the_client_receives_status_response(String result) throws Throwable {
        JSONObject jsonObject = new JSONObject(response.getBody());
        Assert.assertEquals(result, jsonObject.getString("status"));
    }
}
