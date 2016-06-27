class TestOverrideWithSuper {
	public static void main(String[] args){
		ManagerPlus manager = new ManagerPlus();
		manager.setSalary(5000.0);
		System.out.println(manager.getBonus());
	}
}
