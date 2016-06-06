class FactorialsOneToTwenty{
	public static void main(String[] args){
		OUTTER:
		for(int n = 0; n <= 20; n++){
			long factorial = n;
			for (int n2 = n; n2 > 1; n2--){
				factorial = factorial * (n2 - 1);
			}
			System.out.println("Factorial of " + n +" is " + factorial);
		}
	}
}
