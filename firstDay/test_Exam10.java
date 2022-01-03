package firstDay;

public class test_Exam10 {

	public static void main(String[] args) {
		int number = 1;
		//String text1 = '' + number; // ''은 char형이다 String은 ""를 써야한다
		String text2 = "" + number;
		//String text3 = number.toString(); 
		// number가 Integer이면 가능하고 int이면 불가능하다. 
		String text4 = String.valueOf(number);
		// valueOf는 문자열을 숫자형태로 변환할 때 사용하는 연산자이다.
		System.out.println(text2);
		System.out.println(text4);
	}

}
