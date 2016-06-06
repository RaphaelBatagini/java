class Fibonacci{
	public static void main(String[] args){
		int number = 1;
		int previousNumber = 0;
		int n2;

		do {
			if (previousNumber == 0) {
				System.out.println(previousNumber);
				System.out.println(number);
				previousNumber++;
			} else {
				number += previousNumber;
				System.out.println(number);
				previousNumber = number;
			}
		} while(number < 100);
	}
}
