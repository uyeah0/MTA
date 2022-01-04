package secondDay;

public class test_Exam13_SavingsAccount extends test_Exam13_Account{

	double rate = 0.02;
	test_Exam13_SavingsAccount(double startingBalance){
		super(startingBalance);
	}
	
	public String toString() {
		return String.format("Savings Current Balance : $%.2f", this.getBalance());
	}


}
