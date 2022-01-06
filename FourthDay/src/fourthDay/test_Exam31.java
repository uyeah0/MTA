package fourthDay;

public class test_Exam31 {

	public static void main(String[] args) {
		convertStringToNumber("3.14");
	}
	public static void convertStringToNumber(String numberAsString) {
		double number = Double.parseDouble(numberAsString);
		System.out.println(number);
	}

}
