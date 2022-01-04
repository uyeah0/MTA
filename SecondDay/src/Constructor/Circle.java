package Constructor;

public class Circle {
	int radius;
	String name;
	public Circle() { // 생성자 이름은 클래스 이름과 동일
		radius =1;
		name = "";
	}
	public Circle(int r, String n) { // 매개 변수를 가진 생성자
		radius = 1;
		name= n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자"); // Circle 객체 생성, 반지름 10
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
	}

}
