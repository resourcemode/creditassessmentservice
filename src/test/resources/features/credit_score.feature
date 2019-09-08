Feature: Credit Assessment Calculator
  This is a simple credit assessment calculator feature for software engineer candidates

  Scenario Outline: Calculate Credit Assessment Score
    When The calculateCreditAssessmentScore API is called with parameters "<numberOfEmployee>", "<companyType>", "<timeInBusiness>"
    Then The credit assessment score should match "<result>"

    Examples:
      | numberOfEmployee | companyType | timeInBusiness | result |
      | 5 | Sole proprietorship | 5 | 40 |
      | 10 | Partnership | 8 | 123 |
      | 2 | Limited Liability Company | 10 | 99 |
      | 30 | Others | 20 | 129 |