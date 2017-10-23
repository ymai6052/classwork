package doubled;

public class doubletest {
	public static void main(String[]arges)
	{
		int x=2;
		String cake="cake";
		String[] tempArr= {"milk","cake","candy"};
		System.out.println(doubledint(x));
		System.out.println(doubledstr(cake));
		doubleArr(tempArr);
		for(int i=0;i<tempArr.length;i++)
		{
			System.out.print(tempArr[i]);
		}
	}
	public static int doubledint(int x)
	{
		x=x+x;
		return x;
	}
	public static String doubledstr(String str1)
	{
		str1=str1+str1;
		return str1;
	}
	public static String[] doubleArr(String[] strArr)
	{
		int x=0;
		while(x<strArr.length)
		{
			strArr[x]=strArr[x]+strArr[x];
			x++;
		}
		return strArr;
	}
}
