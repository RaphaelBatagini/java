class TestCompany{
	public static void main(String[] args){
		Company company = new Company();
		company.employees = new Employee[10];
		company.name = "Progiro";
		company.cnpj = "54.037.248/0001-56";

		for (int i = 0; i < 11; i++){
			Employee employee = new Employee();
	                employee.name = "Teste " + i;
        	        employee.age = 23;
                	employee.salary = 5000 + i;
			company.addEmployee(employee);
		}

		company.showCompany();
		company.showEmployees();

		boolean check = company.employeeExists("Raphael H. Batagini");
		System.out.println(check);
		check = company.employeeExists("Bill Sample");
		System.out.println(check);
	}
}
