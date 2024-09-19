package bank;

public class BankAccount {
	private int balance = 0;
	private int minBalance = -5000;
	private String owner = "Lisa";
	public int getBalance() {
		return balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
	public int getMinBalance() {
		return minBalance;
	}
	public void setBalance(int balance) {
		if (balance> minBalance) {
			this.balance=balance;
		}
	}
	public BankAccount(int balance, int minBalance, String owner) {
		this.balance = balance;
		this.minBalance = minBalance;
		this.owner = owner;
	}
	public boolean withdraw(int amount) {
		if (balance - amount < minBalance)
			return false;
		balance = balance - amount;
		return true;
	}
	public void deposit(int amount) {
		balance = balance + amount;
	}

	public boolean transfer(BankAccount target, int amount) {
		if (withdraw(amount) == false)
			return false;
		target.deposit(amount);
		return true;
	}
	public String toString() {
		return "balance of " + owner + ": " + balance ;
	}

}


