package thirdDay;

import java.util.ArrayList;

public class test_Exam29 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("양정원");
		a.add("김우석");
		a.add("정재현");
		a.add("박종성");
		a.add("김선우");
		Process(a);
		
	}
	public static void Process(ArrayList<String> invoices) {
		System.out.println(invoices.size()); // 사이즈 확인
		for(int i = 0; i < invoices.size();) {
			String invoice = invoices.get(i);
			System.out.println( i + " :  " + invoices);
			invoices.remove(i);
		}
	}

}
