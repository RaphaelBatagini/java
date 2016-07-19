public class AgencySecretary extends Secretary{
	@Override
	double getBonus() {
		return this.salary * 1.1;
	}
}
