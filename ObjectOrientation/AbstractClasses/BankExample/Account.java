public abstract class Account {

	protected double balance;

	void deposit(double value) {
		this.balance += value;
	}

	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double value){
		this.balance -= value;
	}

	abstract void update(double ratio);
}
