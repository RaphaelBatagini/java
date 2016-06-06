class FibonacciWithTwoVariables {
	public static void main(String[] args) {
		int number = 1;
		int previousNumber = 0;

		System.out.println(previousNumber);
		System.out.println(number);
		previousNumber++;
		System.out.println(previousNumber);

		do {
			number += previousNumber;
			System.out.println(number);
			previousNumber += number;
			System.out.println(previousNumber);
		} while(previousNumber < 100);
	}
}