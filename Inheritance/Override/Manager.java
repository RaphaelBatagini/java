class Manager extends Employee {
	int password;
	int numberOfEmployeesManaged;

	@Override
	public double getBonus(){
		return this.salary * 0.15;
	}
}
