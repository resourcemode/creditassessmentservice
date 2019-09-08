package credit.assessment.creditassessmentservice.usecase.scoremapping;

import credit.assessment.creditassessmentservice.usecase.scoremapping.company.CompanyType;

public abstract class AbstractScoreMapping {

    protected Integer category;
    protected Integer score;
    public abstract Integer getScore();

    public AbstractScoreMapping(Integer category) {
        this.category = category;
    }

    public AbstractScoreMapping(String category) {
        if (CompanyType.Sole_Proprietorship.equals(category)) {
            this.score = 12;
        }

        if (CompanyType.Limited_Liability_Company.equals(category)) {
            this.score = 63;
        }

        if (CompanyType.Partnership.equals(category)) {
            this.score = 75;
        }

        if (CompanyType.Others.equals(category)) {
            this.score = 0;
        }
    }
}
