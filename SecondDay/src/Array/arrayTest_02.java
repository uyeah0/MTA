package Array;

public class arrayTest_02 {
	enum Week{��, ȭ, ��, ��, ��, ��, ��};
	public static void main(String[] args) {
		int[]num = {1,2,3,4,5};
		int sum = 0;
		for(int k : num) { // �ݺ��� ������ k�� num[0], num[1] ..������ ����
			sum += k;
		}
		System.out.println("���� " + sum);
		
		String names[] = {"���", "��" , "�ٳ���", "ü��", "����", "����"};
		for(String s: names) { // �ݺ��� ������ s�� names[0], names[1], .. names[5]�� ����
			System.out.print(s + " ");
		}
		
		
		for( Week day: Week.values()) { // �ݺ��� ������ day�� ��, ȭ, ��, ��, ��, ��, �Ϸ� ����
			System.out.println(day + "����");
		}
		
	}

}
