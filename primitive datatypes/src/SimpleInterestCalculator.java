import java.math.BigDecimal;

public class SimpleInterestCalculator {
	
	private BigDecimal principal;
	private BigDecimal interest;

	
	 public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
	}

	 BigDecimal calculateTotalValue(int noOfYears) {
		 return principal.
				 add(principal.multiply(interest.divide(new BigDecimal(100)))
						 .multiply(new BigDecimal(noOfYears)));
	}

}
