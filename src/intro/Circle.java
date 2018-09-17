package intro;

public class Circle {

	double radius;
	
	public Circle(double rad) {
		radius = rad;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double rad) {
		radius = rad;
	}
	
	public double getPerimeter() {
		return 2 * radius * 3.14;
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}

}
