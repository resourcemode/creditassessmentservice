package credit.assessment.creditassessmentservice.unit;

import credit.assessment.creditassessmentservice.usecase.creditcalculation.contract.response.CreditScoreResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditScoreResponseTest {
    @Test
    public void testResponse()
    {
        CreditScoreResponse response = new CreditScoreResponse();
        Assert.assertEquals("10", response.getResponse(Long.valueOf(10)));
    }
}
