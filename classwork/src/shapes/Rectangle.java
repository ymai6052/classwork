package shapes;

public class Rectangle implements Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		return (length*width);
	}

	public double calculatePerimeter() {
		return((length*2)+(width*2));
	}

	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter()+"\n";
	}
}
