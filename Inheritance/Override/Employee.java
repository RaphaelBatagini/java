class Employee {
	protected String name;
	protected String cpf;
	protected double salary;

	public double getBonus(){
		return this.salary * 0.10;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}
}
