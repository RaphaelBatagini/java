class Employee{
	private String name = "Bill Sample";
	private int age = 23;
	private double salary = 1000.00f;
	private Date hireDate;

	//value shared by all instances
	private static int identifier = 0;

	//set class id with identifier attr
	private int id = Employee.identifier;

	public Employee(){
		Employee.identifier++;
	}

	public Employee(String name){
		Employee.identifier++;
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

	public int getId(){
		return this.id;
	}

	public int getAge(){
		return this.age;
	}

	public void setHireDate(String date){
		this.hireDate = new Date(date);
	}

	public Date getHireDate(){
		return this.hireDate;
	}

	private static int getIdentifier(){
		return Employee.identifier;
	}
}
