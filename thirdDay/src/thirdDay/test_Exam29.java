package thirdDay;

import java.util.ArrayList;

public class test_Exam29 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("������");
		a.add("��켮");
		a.add("������");
		a.add("������");
		a.add("�輱��");
		Process(a);
		
	}
	public static void Process(ArrayList<String> invoices) {
		System.out.println(invoices.size()); // ������ Ȯ��
		for(int i = 0; i < invoices.size();) {
			String invoice = invoices.get(i);
			System.out.println( i + " :  " + invoices);
			invoices.remove(i);
		}
	}

}
