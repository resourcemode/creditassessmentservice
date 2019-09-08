package credit.assessment.creditassessmentservice.usecase.creditcalculation.contract.request;

public class CreditScoreRequest {
    private Integer numberOfEmployee;
    private String companyType;
    private Integer timeInBusiness;

    public CreditScoreRequest(Integer numberOfEmployee, String companyType, Integer timeInBusiness) {
        this.numberOfEmployee = numberOfEmployee;
        this.companyType = companyType;
        this.timeInBusiness = timeInBusiness;
    }

    public Integer getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public String getCompanyType() {
        return companyType;
    }

    public Integer getTimeInBusiness() {
        return timeInBusiness;
    }
}
