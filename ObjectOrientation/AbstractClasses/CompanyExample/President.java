public class President extends Employee {
	@Override
	double getBonus() {
		return this.salary * 1.4 + 2000;
	}
}
