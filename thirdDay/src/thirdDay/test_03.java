package thirdDay;

public class test_03 {

	public static void main(String[] args) {
		String a = new String(" C#");
		System.out.println("a : " + a);
		String b = new String(",C++ ");
		System.out.println("b : " + b);
		
		a = a.concat(b);
		System.out.println("a : " + a);
		a = a.trim();
		System.out.println("a : " + a);
		a = a.replace("C#", "Java");
		System.out.println("a : " + a);
		
		String s[] = a.split(",");
		for(int i = 0; i < s.length; i++) {
			System.out.println( "s[" + i + "] : " + s[i]);
		}
		
		a = a.substring(5);
		System.out.println("a : " + a);
		
		char c = a.charAt(2);
		System.out.println("c : " + c);
	}

}
