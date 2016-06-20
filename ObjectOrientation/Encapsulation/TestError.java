class TestError {
	public static void main(String[] args) {
		Employee employee = new Employee();
		//throw error bacause try access a private attribute
		employee.salary = 5000.00f;
	}
}
