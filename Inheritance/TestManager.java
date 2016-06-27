class TestManager {
	public static void main(String[] args){
		Manager manager = new Manager();

		//call method from employee class
		manager.setName("Bill Sample");

		//call method from manager class
		manager.setPassword(123456);

		manager.authentication(123456);
	}
}
