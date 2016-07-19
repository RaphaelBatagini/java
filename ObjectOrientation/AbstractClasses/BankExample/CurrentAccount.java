public class CurrentAccount extends Account {
	@Override
	public void update(double ratio) {
		this.balance += this.balance * (ratio * 2);
	}
	
	@Override
	void deposit(double value) {
		this.balance += value - 0.10;
	}
}
