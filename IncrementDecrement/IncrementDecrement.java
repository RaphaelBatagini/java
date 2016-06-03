class IncrementDecrement{
	public static void main(String[] args){
		int i = 1;

		//post-increment returns the value before incrementing
		System.out.println(i++);
		System.out.println(i);

		//pre-increment increments the variable value and then return
		System.out.println(++i);

		//sum one to the variable value
		i += 1;
		System.out.println(i);		
	}
}
