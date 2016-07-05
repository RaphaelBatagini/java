public class Account {
	protected double balance;

	public double getBalance(){
		return this.balance;
	}

	public void deposit(double value){
		this.balance += value;
	}

	public void withdraw(double value){
		this.balance -= value;
	}

	public void update(double ratio){
		this.balance += this.balance * ratio;
	}
}
