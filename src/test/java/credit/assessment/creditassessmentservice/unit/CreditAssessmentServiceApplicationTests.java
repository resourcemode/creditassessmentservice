package credit.assessment.creditassessmentservice.unit;

import credit.assessment.creditassessmentservice.usecase.creditcalculation.contract.CreditCalculationUseCase;
import credit.assessment.creditassessmentservice.usecase.creditcalculation.contract.request.CreditScoreRequest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditAssessmentServiceApplicationTests {
    @Test
    public void TestPartnershipScore() {
        CreditScoreRequest request = new CreditScoreRequest(3, "Partnership", 1);
        CreditCalculationUseCase calculationUseCase = new CreditCalculationUseCase();
        Assert.assertEquals(Long.valueOf(75), calculationUseCase.execute(request));
    }

    @Test
    public void TestLimitedLiabilityCompanyScore() {
        CreditScoreRequest request = new CreditScoreRequest(10, "Limited Liability Company", 6);
        CreditCalculationUseCase calculationUseCase = new CreditCalculationUseCase();
        Assert.assertEquals(Long.valueOf(111), calculationUseCase.execute(request));
    }
}
