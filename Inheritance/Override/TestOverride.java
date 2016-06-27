class TestOverride {
	public static void main(String[] args){
		Manager manager = new Manager();
		manager.setSalary(5000.0);
		System.out.println(manager.getBonus());
	}
}
