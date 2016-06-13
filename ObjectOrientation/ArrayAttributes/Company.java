class Company{
	String name = "";
	String cnpj = "";
	Employee[] employees;

	void addEmployee(Employee employee){
		for (int i = 0; i < employees.length; i++) {
			if (this.employees[i] == null) {
				this.employees[i] = employee;
				break;
			}
			System.out.println("There is no more space for new employees");
		}
	}

	void showEmployees(){
		for (Employee x : this.employees) {
			if (x != null) {
				System.out.println("Name: " + x.name);
        	                System.out.println("Age: " + x.age);
                	        System.out.println("Salary: " + x.salary);
			}
		}
	}

	void showCompany(){
		System.out.println("Company name: " + this.name);
		System.out.println("CNPJ: " + this.cnpj);
	}
}
