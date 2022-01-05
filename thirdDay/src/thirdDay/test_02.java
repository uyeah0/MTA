package thirdDay;


public class test_02 {

	public static void main(String[] args) {
		test_02_Point a = new test_02_Point(2,3);
		test_02_Point b = new test_02_Point(2,3);
		test_02_Point c = new test_02_Point(3,4);
		
		if(a==b) // false
			System.out.println("a==b");
		if(a.equals(b))// true;
			System.out.println("a is equal to b");
		if(a.equals(c)) //false;
			System.out.println("a is equal to c");

	}

}
