class TestEncapsulation{
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.setSalary(2000.50);
		System.out.println("id: " + e1.getId() + ". Employee " + e1.getName() + " salary " + e1.getSalary() + " anual earning " + e1.getAnualEarnings());

		Employee e2 = new Employee("Test Rename");
		e2.setSalary(3000.75);
		e2.setHireDate("29/02/2012");
		System.out.println("id: " + e2.getId() + ". Employee " + e2.getName() + " salary " + e2.getSalary() + " anual earning " + e2.getAnualEarnings() + " hire date " + e2.getHireDate().formated());

		Company company = new Company(2);
		company.addEmployee(e1);
		company.addEmployee(e2);
		company.showEmployees();
	}
}
