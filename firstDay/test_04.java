package firstDay;
import java.util.Scanner;

public class test_04 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		char grade;
		System.out.print("������ �Է��ϼ���(0~100) : ");
		int score = scan.nextInt();
		switch (score/10) {
		case 10: // score�� 100
		case 9:
			grade = 'A'; // score�� 90~99
			break;
		case 8:
			grade = 'B'; // score�� 80~89
			break;
		case 7:
			grade = 'C'; // score�� 70~79
			break;
		case 6:
			grade = 'D'; // score�� 60~69
			break;
		default:
			grade = 'F'; // score�� 59����
			break;
		}
		
		System.out.println("������ " + grade + "�Դϴ�.");
		scan.close();
		
	}
}
