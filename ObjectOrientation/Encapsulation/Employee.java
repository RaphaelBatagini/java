class Employee{
	private String name = "Bill Sample";
	private int age = 23;
	private double salary = 1000.00f;

	public Employee(){
		//default constructor with no arguments
	}

	public Employee(String name){
		this.name = name;
	}

	public double getSalary(){
		return this.salary;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public double getAnualEarnings(){
		return this.salary * 12;
	}

	public String getName(){
		return this.name;
	}
}
