class ChainedFors{
	public static void main(String[] args){
		for (int n = 1; n <= 5; n++) {
			for (int i = 1; i <= n; i++) {
				System.out.print(n * i);
			}
			System.out.print("\n");
		}
	}
}