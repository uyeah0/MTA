package fourthDay;

public class test_Exam35 {

	public static void main(String[] args) {
		String s1 = "양정원";
		String s2 = "양정원";
		String s3 = s2;
		if(s1 == s2)
			System.out.println("s1과 s2 같은 개체를 참조");
		
		s1 = "김선우";
		s2 = "김선우";
		 System.out.println(s1);
		 System.out.println(s2);

	}

}
