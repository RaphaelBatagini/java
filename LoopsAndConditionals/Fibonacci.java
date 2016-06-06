class Fibonacci{
	public static void main(String[] args){
		int number = 1;
		int previousNumber = 0;
		int tmp;

		System.out.println(previousNumber);
		System.out.println(number);

		do {
			tmp = number + previousNumber;
			System.out.println(tmp);
			previousNumber = number;
			number = tmp;
		} while(number < 100);
	}
}