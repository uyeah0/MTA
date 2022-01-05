package thirdDay;

class Shape{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
public class overridingTest01 extends Shape{
	protected String name;
	public void draw() {
		name = "Circle";
		super.name = "Shape";
		super.draw();
		System.out.println(name);
	}
	public static void main(String[] args) {
		Shape b = new overridingTest01();
		b.paint();

	}

}
