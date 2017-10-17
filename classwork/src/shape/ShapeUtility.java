package shape;

import java.util.Random;

public class ShapeUtility{
	public static double sumperimeter(Shape[] shapeArr)
	{
		double perisum=0;
		for(int i=0;i<shapeArr.length;i++)
		{
			perisum+=shapeArr[i].perimeter();
		}
		return perisum;
	}
	public static double sumarea(Shape[] shapeArr)
	{
		double areasum=0;
		for(int i=0;i<shapeArr.length;i++)
		{
			areasum+=shapeArr[i].area();
		}
		return areasum;
	}
	public static Shape getRandomShape()
	{
		Random r=new Random();
		int x=r.nextInt(3);
		switch(x)
		{
		case 0:return new Circle(r.nextInt(100)+1);
		
		case 1:return new Rectangle(r.nextInt(100)+1,r.nextInt(100)+1);
		
		default:return new Square(r.nextInt(100)+1);
		}
	}
}
