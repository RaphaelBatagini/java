class CarFactory {
	//static variable that contains the instance of this class
	private static CarFactory instance;

	//private constructor suppress the default public constructor
	private CarFactory(){
	}

	//public static method of unique access of the object
	public static CarFactory getInstance(){

		if(instance == null){
			instanceInitialize();
		}

		//return the class instance
		return instance;
	}

	//this method should be synchronized to avoid concurrence to create more than one instance
	private static synchronized void instanceInitialize(){
		if(instance == null){
			instance = new CarFactory();
		}
	}
}
