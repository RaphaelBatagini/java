class Fibonacci{

	int[] fibonacci = new int[10];

	int calculateFibonacci(int num){

		if (num != 0 && this.fibonacci[num] != 0){
			return this.fibonacci[num];
		}

		if (num == 0 || num == 1) {
			this.fibonacci[num] = num;
			return this.fibonacci[num];
		}

		this.fibonacci[num] = calculateFibonacci(num - 1) + calculateFibonacci(num - 2);
		return this.fibonacci[num];
	}	
}
