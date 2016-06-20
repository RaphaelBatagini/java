class Test{
	Employee e1 = new Employee();
	e1.setSalary(2000.50);
	System.out.println("Employee " + e1.getName + " salary " + e1.getSalary + " anual earning " + e1.getAnualEarnings);

	Employee e2 = new Employee("Test Rename");
	e2.setSalary(3000.75);
	System.out.println("Employee " + e2.getName + " salary " + e2.getSalary + " anual earning " + e2.getAnualEarnings);
}
