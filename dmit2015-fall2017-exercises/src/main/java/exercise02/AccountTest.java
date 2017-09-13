package exercise02;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import exercise02.Account;

public class AccountTest {

	
	@Test
	public void testAll() {
		Account currentAccount = new Account(1122, 100,"George");
		currentAccount.setAnnualInterestRate(1.5);
		currentAccount.deposit(30,"from mom");
		currentAccount.deposit(40, "from girlfriend");
		currentAccount.deposit(50, "from ex-girlfriend");
		currentAccount.withdraw(5, "donate to red cross");
		currentAccount.withdraw(4, "coffee");
		currentAccount.withdraw(3, "candy");
		// check the account holder name is  "George"
		assertEquals("George", currentAccount.getName());
		//check the interest rate is 1.5
		assertEquals(1.5,currentAccount.getAnnualInterestRate(),0.0005);
		//check the balance is 208
		assertEquals(208.0,currentAccount.getBalance(),0.00005);
		
		//check the number of transaction is 6
		assertEquals(6,currentAccount.getTransactions().size());
		//check all 3 withdraw transaction
		//assertEquals(5, currentAccount.getTransactions().);
		//check all 3 deposit transaction
		
	}

}
