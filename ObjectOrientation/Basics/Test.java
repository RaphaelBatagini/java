class Test{
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.name = "Bill Test";
		employee.salary = 1000;
		Date date = new Date();
		employee.hireDate = date;
		employee.hireDate.day = 01;
		employee.hireDate.month = 01;
		employee.hireDate.year = 2001;
		employee.document = "00.000.000-00";

		Employee employee2 = new Employee();
                employee2.name = "Bill Test";
                employee2.salary = 1000;
                employee2.hireDate = date;
                employee2.document = "00.000.000-00";

		//the comparison will return false because each instance made reference to a different block in memory
		if (employee == employee2){
			System.out.println("never called");
		} else {
			System.out.println("Two identical instances can't be declared as equal because each one refer to a different block in memory");
		}

		Employee employee3 = employee2;
		if (employee3 == employee2){
			System.out.println("Two variables with the same reference to a memory block are equal");
		}

		employee.increaseSalary(1000);
		employee.show();
	}
}
