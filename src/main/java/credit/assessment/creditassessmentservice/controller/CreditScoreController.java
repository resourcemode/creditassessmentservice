package credit.assessment.creditassessmentservice.controller;

import credit.assessment.creditassessmentservice.usecase.creditcalculation.contract.CreditCalculationUseCase;
import credit.assessment.creditassessmentservice.usecase.creditcalculation.contract.request.CreditScoreRequest;
import credit.assessment.creditassessmentservice.usecase.creditcalculation.contract.response.CreditScoreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreditScoreController {
    @Autowired
    private final CreditScoreResponse creditScoreResponse;
    @Autowired
    private final CreditCalculationUseCase creditCalculationUseCase;

    public CreditScoreController(CreditScoreResponse creditScoreResponse, CreditCalculationUseCase creditCalculationUseCase)
    {
        this.creditScoreResponse = creditScoreResponse;
        this.creditCalculationUseCase = creditCalculationUseCase;
    }

    @PostMapping(value = "/v1/creditscore", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String postCalculate(@RequestBody CreditScoreRequest creditScoreRequest)
    {
        Long results = creditCalculationUseCase.execute(creditScoreRequest);
        return creditScoreResponse.getResponse(results);
    }
}
