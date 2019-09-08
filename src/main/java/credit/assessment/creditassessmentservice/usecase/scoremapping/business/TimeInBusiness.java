package credit.assessment.creditassessmentservice.usecase.scoremapping.business;

import credit.assessment.creditassessmentservice.usecase.scoremapping.AbstractScoreMapping;

import java.time.temporal.ValueRange;

public class TimeInBusiness extends AbstractScoreMapping {
    public TimeInBusiness(int category) {
        super(category);
    }

    @Override
    public Integer getScore() {
        ValueRange rangeZeroToThree = ValueRange.of(0, 3);
        if (rangeZeroToThree.isValidValue(this.category)) {
            return 0;
        }

        ValueRange rangeFourToNine = ValueRange.of(4, 9);
        if (rangeFourToNine.isValidValue(this.category)) {
            return 28;
        }

        ValueRange rangeTeenToFifteen = ValueRange.of(10, 15);
        if (rangeTeenToFifteen.isValidValue(this.category)) {
            return 36;
        }

        ValueRange rangeSixteenAbove = ValueRange.of(20, Integer.MAX_VALUE);
        if (rangeSixteenAbove.isValidValue(this.category)) {
            return 59;
        }

        return null;
    }
}
