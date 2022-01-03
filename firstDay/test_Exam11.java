package firstDay;
import java.util.Scanner;

public class test_Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner("1 탁월 2 우수 3 양호 4 불량");
		Object data1 = sc.next(); // 공백 전까지 문자 읽고 다음으로 넘기기
		Object data2 = sc.next(); // 공백 전까지 문자 읽고 다음으로 넘기기
		Object data3 = sc.nextInt(); // 공백 전까지 정수 읽고 다음으로 넘기기
		Object data4 = sc.nextLine(); // 엔터키까지의 입력을 다 가지고 온다
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}

}

