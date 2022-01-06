package fourthDay;

public class test_Exam36 {

	public static void main(String[] args) {
		
		String name = "YuYeyoung";
		name = showGreeting(name);
		System.out.println(name);

	}
	
	public static String showGreeting(String firstName) {
		String welcomeMsg = "æ»≥Á«œººø‰ ";
		welcomeMsg += (firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase());
		
		return welcomeMsg;
	}

}
