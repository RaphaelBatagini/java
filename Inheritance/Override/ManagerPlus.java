class ManagerPlus extends Employee {
	int password;
	int numberOfEmployeesManaged;

	@Override
	public double getBonus(){
		return super.getBonus() + 1000;
	}
}
