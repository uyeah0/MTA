package firstDay;

public class test_Exam02 {
	private int id = 3; // 한 클래스에 들어있기 때문에 private여도 상관없다
	public static void main(String []args)
	{
		test_Exam02 customer = new test_Exam02(); 
		customer.id = 5; // customer. 접수사를 추가해야 id와 showId()를 가져올 수 있다.
		customer.showId();
	}
	protected void showId(){ // 한 클래스에 들어있기 때문에 public으로 변경하지 않아도 상관없다
		System.out.println(id);
	}
	

}
