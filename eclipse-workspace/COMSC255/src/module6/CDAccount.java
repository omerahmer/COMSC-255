// Omer Ahmer, ID 2014063

package module6;

public class CDAccount extends Account {
	private int duration;
	private double CDannualInterestRate;

	public CDAccount() {
	}

	public CDAccount(int id, double balance, int duration) {
		super(id, balance);
		this.duration = duration;
		setCDannualInterestRate();
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
		setCDannualInterestRate();
	}

	public double getCDannualInterestRate() {
		return CDannualInterestRate;
	}

	private void setCDannualInterestRate() {
		double CDannualInterestRate = 0;
		int multiplier = (this.duration - this.duration % 3) / 3;
		CDannualInterestRate = this.getAnnualInterestRate() + 0.5 * multiplier;
		this.CDannualInterestRate = CDannualInterestRate;
	}

	public double getMatureBalance() {
		double matureBalance = this.getBalance() * Math.pow((1 + this.getMonthlyInterestRate()), duration);
		return matureBalance;
	}

	public double getMonthlyInterestRate() {
		return (this.getCDannualInterestRate() / 1200);
	}

	@Override
	public String toString() {
		return "Account Number\t\tInitial Balance\t\tMatural Balance\t\tRate(%)\t\tDate Created\n"
				+ "====================================================================================================================\n"
				+ "\t" + this.getID() + "\t\t\t" + String.format("%.02f", this.getBalance()) + "\t\t\t"
				+ String.format("%.02f", this.getMatureBalance()) + "\t\t"
				+ String.format("%.02f", this.getCDannualInterestRate()) + "\t\t" + this.getDateCreated();
	}
	
	@Override
    public final void withdraw(double amount) {
        System.out.println("A CD Account can't withdraw any cash. You need to close this CD account.");
    }

    @Override
    public final void deposit(double amount) {
        System.out.println("A CD Account can't make any additional deposit. You may open another CD account.");
    }

	public void displayMonthlyInterests() {
		double matureBalance = 0;
		System.out.println();
		for (int i = 1; i <= this.duration; i++) {
			matureBalance = this.getBalance() * Math.pow((1 + this.getMonthlyInterestRate()), i);
			System.out.printf("Month %d \t\t %.2f\n", i, matureBalance);
		}
	}
}