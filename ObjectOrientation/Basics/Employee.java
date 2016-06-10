class Employee {
	String name = "";
	double salary = 0;
	Date hireDate = new Date();
	String document = "";

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
		System.out.println("Day: " + this.hireDate.formated());
		System.out.println(this.document);
		System.out.println(this.calculateAnualEarnings());
	}
}
