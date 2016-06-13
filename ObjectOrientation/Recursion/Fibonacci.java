class Fibonacci{
	int calculateFibonacci(int num){
		return (num == 0) ? 0 : (num == 1) ? 1 : calculateFibonacci(--num) + calculateFibonacci(--num);
	}	
}
