package secondDay;

public class test_Exam01 {

	public static void main(String[] args) {
		DoWhileSample();
	}
	private static void DoWhileSample() {
		// TODO Auto-generated method stub
		char c = 'a';
		
		do {
			
			System.out.println(c);
			c = (char)(c+1);
		}while(c <= 'z');
	}
	

}
