package credit.assessment.creditassessmentservice.usecase.creditcalculation.contract.response;

import org.springframework.stereotype.Service;

@Service
public class CreditScoreResponse {
    public String getResponse(Long response)
    {
        return response.toString();
    }
}
