class Test {
	public static void main(String[] args){
		Fibonacci fibonacci = new Fibonacci();
		for (int i = 0; i <= 6; i++) {
			int result = fibonacci.calculateFibonacci(i);
  			System.out.println(result);
		}
	}
}
