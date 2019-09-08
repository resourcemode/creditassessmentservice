package credit.assessment.creditassessmentservice.unit;

import credit.assessment.creditassessmentservice.usecase.creditcalculation.contract.request.CreditScoreRequest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditScoreRequestTest {
    @Test
    public void testResponse()
    {
        CreditScoreRequest request = new CreditScoreRequest(10, "Others", 20);
        Assert.assertEquals("Others", request.getCompanyType());
        Assert.assertEquals(Integer.valueOf(20), request.getTimeInBusiness());
        Assert.assertEquals(Integer.valueOf(10), request.getNumberOfEmployee());
    }
}
