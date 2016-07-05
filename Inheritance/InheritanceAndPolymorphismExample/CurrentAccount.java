public class CurrentAccount extends Account{
	public void update(double ratio){
		super.update(ratio * 2);
	}

	public void deposit(double value){
		this.balance += value - 0.10;
	}
}
