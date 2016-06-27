class Manager extends Employee {
	int password;
	int numberOfEmployeesManaged;

	public double getBonus(){
		return this.salary * 0.15;
	}
}
