public class Principal {
	public static void main(String[] args) {
		Account ca = new CurrentAccount();
		Account sa = new SavingAccount();
		Account ca1 = new CurrentAccount();

		Bank bank = new Bank();

		ca.deposit(1000);
		sa.deposit(1000);
		ca1.deposit(1000);

		bank.add(ca);
		bank.add(sa);
		bank.add(ca1);

		AccountUpdater au = new AccountUpdater(0.01);

		for (int i = 0; i < bank.getTotalAccounts(); i++) {
			Account account = bank.get(i);
			au.run(account);
		}

		System.out.println("Saldo total " + au.getTotalBalance());
	}
}
