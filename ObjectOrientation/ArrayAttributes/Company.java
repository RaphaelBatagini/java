class Company{
	String name = "";
	String cnpj = "";
	Employee[] employees;

	void addEmployee(Employee employee){
		boolean done = false;
		for (int i = 0; i < employees.length; i++) {
			//find the first unused index
			if (this.employees[i] == null) {
				this.employees[i] = employee;
				done = true;
				break;
			}
		}
		
		//if there is no unused space
		if (!done) {
			//create more space
			Employee[] employees2 = new Employee[this.employees.length + 10];
			int count = 0;
			for (int i = 0; i < this.employees.length; i++){
				employees2[i] = this.employees[i];
				count = i + 1;
			}
			this.employees = employees2;
			this.employees[count] = employee;
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

	boolean employeeExists(String name){
		for (Employee x : this.employees) {
			if (x != null) {
	                        if (x.name == name) {
        	                        return true;
                	        }
			}
                }
		return false;
	}
}
