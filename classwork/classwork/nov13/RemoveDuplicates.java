package nov13;

public class RemoveDuplicates {
	public static void main(String[]args)
	{
		int[] test1= {1,4,4,5,2,4,2,5};
		int[] test2= {34,2,7,7,7};
		int[] test3= {};
		
		long startTime=System.nanoTime();
		System.out.println(countUnique(test1));
		long endTime=System.nanoTime();
		long totalTime=endTime-startTime;
		System.out.println("Time Taken in nanoseconds: "+totalTime);
	
		System.out.println(countUnique(test2));
		System.out.println(countUnique(test3));
	}
	public static int countUnique(int[] numbers)
	{
		int count=0;
		for(int i=0;i<numbers.length;i++)
		{
			boolean unique=true;
			for(int j=i + 1 ; j<numbers.length; j++);
			{
				if(numbers[i]==numbers[z])
				{
					unique=false;
					break;
				}
			}
			if(unique)
			{
				count++;
			}
		}
		return count;
	}
}
