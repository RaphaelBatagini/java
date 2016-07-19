public class SavingAccount extends Account {
	@Override
	public void update(double ratio) {
		this.balance += this.balance * (ratio * 3);
	}
}
