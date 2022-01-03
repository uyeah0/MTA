package firstDay;

public class test_Exam09 {

	public static void main(String[] args) {
		int income = 0;
		int age = 0;
		if( ((age > 65) && (income >= 10000)) || 
				((age >= 21) && (income > 25000))) {
			System.out.println("Approved");
		}else {
			System.out.println("Declined");
		}

	}

}
