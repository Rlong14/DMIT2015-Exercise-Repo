package excercise02;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import exercise02.Account;
import exercise02.Transaction;

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
		
		// print the id, balance, annualinterestrate, datecreated for the current account
		//using the System.out.println("") statement
//		System.out.println("Account id = " + currentAccount.getId());
//		System.out.println("Account balance = " + currentAccount.getBalance());
//		System.out.println("Account annualInterestRate = " + currentAccount.getAnnualInterestRate());
//		System.out.println("Account dateCreated = " + currentAccount.getDateCreated());
//		System.out.println("Account name = " + currentAccount.getName());
		//print all the transactions for the current account
//		for(Transaction currentTransaction : currentAccount.getTransactions()) {
//			System.out.println("Transaction date = " + currentTransaction.getDate());
//			System.out.println("Transaction type = " + currentTransaction.getType());
//			System.out.println("Transaction amount = " + currentTransaction.getAmount());
//			System.out.println("Transaction balance = " + currentTransaction.getBalance());
//			System.out.println("Transaction description = " + currentTransaction.getDescription());
//		}
		System.out.println(currentAccount);
		
		// check the account holder name is  "George"
		assertEquals("George", currentAccount.getName());
		//check the interest rate is 1.5
		assertEquals(1.5,currentAccount.getAnnualInterestRate(),0.0005);
		//check the balance is 208
		assertEquals(208.0,currentAccount.getBalance(),0.00005);
		
		//check the number of transaction is 6
		assertEquals(6,currentAccount.getTransactions().size());
		//check all 3 withdraw transaction
		Transaction transaction1 = currentAccount.getTransactions().get(0);
		assertEquals(30,transaction1.getAmount(),0);
		assertEquals(130,transaction1.getBalance(),0);
		assertEquals("from mom", transaction1.getDescription());
		//check all 3 deposit transaction
		
	}

}
