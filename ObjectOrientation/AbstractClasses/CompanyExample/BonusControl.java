public class BonusControl {
	private double totalOfBonus = 0;

    public void register(Employee e) {
      System.out.println("adding bonus to employee: " + e);
      this.totalOfBonus += e.getBonus();
    }

    public double getTotalOfBonus() {
		return this.totalOfBonus;
    }
}
