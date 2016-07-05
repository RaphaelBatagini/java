class AccountUpdater {
	private double totalBalance;
	private double selic;

	public AccountUpdater(double selic){
		this.selic = selic;
	}

	public void run(Account a){
		System.out.println("Previous balance " + a.getBalance());
		a.update(this.selic);
		System.out.println("Final balance " + a.getBalance());
		this.totalBalance += a.getBalance();
	}

	public double getTotalBalance(){
		return this.totalBalance;
	}
}
