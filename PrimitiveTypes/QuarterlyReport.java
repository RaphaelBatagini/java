class QuarterlyReport{
	public static void main(String[] args){
		//variables for each month
		int januaryExpenses = 15000;
		int februaryExpenses = 23000;
		int marchExpenses = 17000;

		int quarterlyExpenses = januaryExpenses + februaryExpenses + marchExpenses;
		System.out.println("Quarterly expenses = " + quarterlyExpenses);

		int monthlyAverage = quarterlyExpenses / 3;
		System.out.println("Monthly average  = " + monthlyAverage);
	}
}
