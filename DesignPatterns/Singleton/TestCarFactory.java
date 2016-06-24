class TestCarFactory {
	public static void main(String[] args){
		CarFactory carFactory1 = CarFactory.getInstance();
		CarFactory carFactory2 = CarFactory.getInstance();

		if (carFactory1 == carFactory2) {
			System.out.println("This variables refer to the same object in memory");
		}
	}
}
