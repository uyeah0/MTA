package firstDay;
import java.util.Scanner;

public class test_04 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scan.nextInt();
		switch (score/10) {
		case 10: // score는 100
		case 9:
			grade = 'A'; // score는 90~99
			break;
		case 8:
			grade = 'B'; // score는 80~89
			break;
		case 7:
			grade = 'C'; // score는 70~79
			break;
		case 6:
			grade = 'D'; // score는 60~69
			break;
		default:
			grade = 'F'; // score는 59이하
			break;
		}
		
		System.out.println("학점은 " + grade + "입니다.");
		scan.close();
		
	}
}
