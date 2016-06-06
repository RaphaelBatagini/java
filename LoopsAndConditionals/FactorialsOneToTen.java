class FactorialsOneToTen{
	public static void main(String[] args){
		OUTTER:
		for(int n = 0; n <= 10; n++){
			int factorial = n;
			for (int n2 = n; n2 > 1; n2--){
				factorial = factorial * (n2 - 1);
			}
			System.out.println("Factorial of " + n +" is " + factorial);
		}
	}
}
