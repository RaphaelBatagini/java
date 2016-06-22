class Company{
	private String name = "";
	private String cnpj = "";
	private Employee[] employees;

	public Company(int numberOfEmployees){
		this.employees = new Employee[numberOfEmployees];
	}

	public void setName(String name){
		this.name = name;
	}

	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}

	public Employee getEmployee(int position){
		return this.employees[position];
	}

	void addEmployee(Employee employee){
		boolean done = false;
		for (int i = 0; i < this.employees.length; i++) {
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
				System.out.println("Name: " + x.getName());
        	                System.out.println("Age: " + x.getAge());
                	        System.out.println("Salary: " + x.getSalary());
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
	                        if (new String(x.getName()).equals(name)) {
        	                        return true;
                	        }
			}
                }
		return false;
	}
}
