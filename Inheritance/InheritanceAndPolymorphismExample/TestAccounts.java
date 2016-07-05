class TestAccounts {
	public static void main(String[] args){
		Account a = new Account();
		Account sa = new SavingsAccount();
		Account ca = new CurrentAccount();

		Bank bank = new Bank();

		a.deposit(1000);
                sa.deposit(1000);
                ca.deposit(1000);

		bank.add(a);
                bank.add(sa);
                bank.add(ca);

		AccountUpdater au = new AccountUpdater(0.01);

		for (int i = 0; i < bank.getTotalAccounts(); i++) {
			Account account = bank.get(i);
			au.run(account);
		}

		System.out.println("Saldo total " + au.getTotalBalance());
	}
}
