class TestCompany{
	public static void main(String[] args){
		Company company = new Company();
		company.employees = new Employee[10];
		company.name = "Progiro";
		company.cnpj = "54.037.248/0001-56";
		
		Employee employee = new Employee();
		employee.name = "Raphael H. Batagini";
		employee.age = 23;
		employee.salary = 5000.99;

		company.addEmployee(employee);

		company.showCompany();
		company.showEmployees();
	}
}
