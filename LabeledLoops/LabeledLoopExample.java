class LabeledLoopExample{
	public static void main(String[] args){
		int[] myArray = new int[]{0,1,2,3,4,5};
		OUTTER:
		for (int i = 0; i <= 5; i++)
		{
			for (int j = 0; j <= 5; j++)
			{
				if ( myArray[i] > myArray[j] )
					break OUTTER;
				else if ( myArray[i] < myArray[j] )
					break;
			}
			System.out.println("The break will end up here!");
		}
		System.out.println("The break OUTTER will end up here!");
	}
}
