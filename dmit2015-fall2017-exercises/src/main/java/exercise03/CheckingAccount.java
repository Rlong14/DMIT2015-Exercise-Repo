package exercise03;

public class CheckingAccount extends BankAccount {

	@Override
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}

	}

}
