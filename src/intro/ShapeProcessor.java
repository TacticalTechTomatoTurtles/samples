package intro;

public class ShapeProcessor {

	public ShapeProcessor() {
		
	}
	
	public static void main(String[] args) {
		// Exercise 1
		Circle c = new Circle(5);
		System.out.println(c.getArea());
		
		// Exercise 2
		if(c.getArea() > 20) {
			System.out.println("This is a large circle");
		} else if(c.getArea() > 12 && c.getArea() <= 20) {
			System.out.println("This is a medium circle");
		} else if(c.getArea() > 5 && c.getArea() <= 12) {
			System.out.println("This is a smallish circle");
		} else {
			System.out.println("This is a small circle");
		}
	}

}
