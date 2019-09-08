package credit.assessment.creditassessmentservice.integration.runner;

import credit.assessment.creditassessmentservice.integration.ApplicationIntegrationTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class CreditScoreStep extends ApplicationIntegrationTest {
    @When("^The calculateCreditAssessmentScore API is called with parameters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void the_calculateCreditAssessmentScore_API_is_called_with_parameters(String numberOfEmployee, String companyType, String timeInBusiness) throws JSONException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        JSONObject jo = new JSONObject();
        jo.put("numberOfEmployee", numberOfEmployee);
        jo.put("companyType", companyType);
        jo.put("timeInBusiness", timeInBusiness);
        String body = jo.toString();
        HttpEntity<String> httpEntity = new HttpEntity(body, headers);
        post("v1/creditscore", httpEntity);
    }

    @Then("^The credit assessment score should match \"([^\"]*)\"$")
    public void the_credit_assessment_score_should_match(String result) {
        Assert.assertEquals(result, response.getBody());
    }
}
