package credit.assessment.creditassessmentservice.usecase.scoremapping.employee;

import credit.assessment.creditassessmentservice.usecase.scoremapping.AbstractScoreMapping;

import java.time.temporal.ValueRange;

public class NumberOfEmployee extends AbstractScoreMapping {

    public NumberOfEmployee(int numberOfEmployee) {
        super(numberOfEmployee);
    }

    @Override
    public Integer getScore()
    {
        ValueRange rangeOneToFive = ValueRange.of(1, 5);
        if (rangeOneToFive.isValidValue(this.category)) {
            return 0;
        }

        ValueRange rangeSixToTen = ValueRange.of(6, 10);
        if (rangeSixToTen.isValidValue(this.category)) {
            return 20;
        }

        ValueRange rangeElevenToFifteen = ValueRange.of(11, 15);
        if (rangeElevenToFifteen.isValidValue(this.category)) {
            return 32;
        }

        ValueRange rangeSixteenToTwenty = ValueRange.of(16, 20);
        if (rangeSixteenToTwenty.isValidValue(this.category)) {
            return 55;
        }

        ValueRange rangeTweenAbove = ValueRange.of(20, Integer.MAX_VALUE);
        if (rangeTweenAbove.isValidValue(this.category)) {
            return 70;
        }

        return null;
    }
}
