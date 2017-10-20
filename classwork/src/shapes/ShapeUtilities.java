package shapes;

import java.util.Random;

public class ShapeUtilities {

	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(3);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		default:
			return new Circle(rand.nextInt(100));
		}

	}

	public static double sumArea(Shape[] shapes) {
		double areasum=0;
		for(int i=0;i<shapes.length;i++)
		{
			areasum+=shapes[i].calculateArea();
		}
		return areasum;
	}

	public static double sumPerimeter(Shape[] shapes) {
		double perisum=0;
		for(int i=0;i<shapes.length;i++)
		{
			perisum+=shapes[i].calculatePerimeter();
		}
		return perisum;
	}

}
