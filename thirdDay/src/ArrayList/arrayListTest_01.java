package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListTest_01 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		//ArrayList<String> a = new ArrayList<>();�� 
		//var b = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < 4; i++) {
			System.out.print("�̸��� �Է��ϼ��� >>> "); 
			String s = sc.next(); // Ű����κ��� �Է�
			a.add(s); // ����Ʈ �÷��ǿ� ����
		}
		// ArrayList�� ��� �ִ� ��� �̸� ���
		for(int i =0;i < a.size(); i++) {
			// ArrayList�� i ��° ���ڿ� ������
			String name = a.get(i);
			System.out.print(name + " ");
		}
		// ���� �� �̸� ���
		int longsetIndex = 0;
		for(int i = 1; i < a.size(); i++) {
			if(a.get(longsetIndex).length() < a.get(i).length())
				longsetIndex = i;
		}
		System.out.println("���� �� �̸��� : " + a.get(longsetIndex));

		sc.close();
	}

}
