package shapes;

public class Circle implements Shape {

	// fields
	private int radius;
	private static double pi = 3.14;

	public Circle(int radius) {
		this.radius=radius;
	}

	public double calculateArea() {
		return radius*radius*pi;
	}

	public double calculatePerimeter() {
		return 2*radius*pi;
	}

	public String toString() {
		return "Circle radius: "+radius+" Area: "+this.calculateArea()+" perimeter: "+this.calculatePerimeter()+"\n";
	}
}
