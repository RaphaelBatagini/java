class Manager extends Employee{
	int password;
	int numberOfEmployeesManaged;

	public boolean authentication(int password){
		if (this.password == password) {
			System.out.println("Access granted to " + this.getName());
			return true;
		} else {
			System.out.println("Access denied to " + this.getName());
			return false;
		}
	}

	public void setPassword(int password){
		this.password = password;
	}
}
