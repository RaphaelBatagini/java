class ArrayTest{
	public static void main(String[] args){
		//can create, no problems
		String[] test = new String[0];
		//throw Exception, index doesnt exists
		test[0] = "test";
		//throw Exception negative index
		String[] test1 = new String[-1];
	}
}
