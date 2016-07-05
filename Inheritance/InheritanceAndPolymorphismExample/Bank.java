public class Bank {
	private	Account[] accounts = new Account[10];
	private static int accountsCounter = 0;

	public void add(Account a){
		this.accounts[Bank.accountsCounter] = a;
		Bank.accountsCounter += 1;
	}

	public Account get(int index){
		return this.accounts[index];
	}

	public int getTotalAccounts(){
		return Bank.accountsCounter;
	}
}
