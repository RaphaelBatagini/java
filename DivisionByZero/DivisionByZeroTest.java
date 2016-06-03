class DivisionByOTest{
	public static void main(String[] args){
		double result = 5 / 0.0;
		//the result of the disivion by 0.0 is infinity
		System.out.println("The result is " + result);
		//Throw exeption because the division by zero in mathematic is undefined
		int result1 = 5 / 0;
	}
}
