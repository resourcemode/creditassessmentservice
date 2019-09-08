package credit.assessment.creditassessmentservice.usecase.scoremapping.company;

import credit.assessment.creditassessmentservice.usecase.scoremapping.AbstractScoreMapping;

public class CompanyType  extends AbstractScoreMapping {
    public static final String Sole_Proprietorship = "Sole proprietorship";
    public static final String Limited_Liability_Company = "Limited Liability Company";
    public static final String Partnership = "Partnership";
    public static final String Others = "Others";

    public CompanyType(String companyType) {
        super(companyType);
    }

    @Override
    public Integer getScore() {
        return this.score;
    }
}
