package credit.assessment.creditassessmentservice.usecase.creditcalculation.contract;

import credit.assessment.creditassessmentservice.usecase.creditcalculation.contract.request.CreditScoreRequest;
import credit.assessment.creditassessmentservice.usecase.scoremapping.business.TimeInBusiness;
import credit.assessment.creditassessmentservice.usecase.scoremapping.company.CompanyType;
import credit.assessment.creditassessmentservice.usecase.scoremapping.employee.NumberOfEmployee;
import org.springframework.stereotype.Service;

@Service
public class CreditCalculationUseCase {
    public Long execute(CreditScoreRequest creditScoreRequest) {
        NumberOfEmployee numberOfEmployee = new NumberOfEmployee(creditScoreRequest.getNumberOfEmployee());
        CompanyType companyType = new CompanyType(creditScoreRequest.getCompanyType());
        TimeInBusiness timeInBusiness = new TimeInBusiness(creditScoreRequest.getTimeInBusiness());

        return add(timeInBusiness.getScore(), numberOfEmployee.getScore(), companyType.getScore());
    }

    private Long add(Integer timeInBusiness, Integer numberOfEmployee, Integer companyType)
    {
        int result = timeInBusiness + numberOfEmployee + companyType;

        return Long.valueOf(result);
    }
}
