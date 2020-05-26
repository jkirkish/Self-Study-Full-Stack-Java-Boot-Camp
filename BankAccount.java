/**
 * 
 */
package testingBankAcconts;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @author jkirkish
 *
 */
public class BankAccount {

	/**
	 * 
	 */
	private BigDecimal amount;
	private String accountType;
	/**
	 * @param amount
	 * @param accountType
	 */
	public BankAccount() 
	{
		this.amount = new BigDecimal(0);
		this.accountType = "CHECKING";
	}
	
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double money) {
		BigDecimal balance = new BigDecimal(money);
		this.amount = balance;
		
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void deposit(double value) {
		//MathContext mc = new MathContext(1);
		BigDecimal deposit = new BigDecimal(value);
		amount = amount.add(deposit); 
	}
	public void withDrawal(double value1) {
		//MathContext mc = new MathContext(1);
		BigDecimal withdraw = new BigDecimal(value1);
		amount = amount.subtract(withdraw); 
	}
}
