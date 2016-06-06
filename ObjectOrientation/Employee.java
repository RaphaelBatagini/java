class Employee {
	String name = "Bill Test";
	//Department department;
	double salary = 1000;
	String hireDate = "01/01/2001";
	String document = "00.000.000-0";

	void increaseSalary(double value)
	{
		this.salary += value;
	}

	double calculateAnualEarnings()
	{
		return this.salary * 12;
	}

	void show()
	{
		System.out.println(this.name);
		System.out.println(this.salary);
		System.out.println(this.hireDate);
		System.out.println(this.document);
		System.out.println(this.calculateAnualEarnings());
	}
}