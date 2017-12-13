package listremovedup;

import java.util.ArrayList;
import java.util.List;

public class removedup {
	public static void main(String[] args)
	{
		List<Integer> test1 = new ArrayList<Integer>();
		test1.add(10);
		test1.add(5);
		test1.add(5);test1.add(4);test1.add(3);test1.add(2);test1.add(1);
		test1=removedupes(test1);
		System.out.println(test1);
	}
	public static List<Integer> removedupes(List<Integer> nums)
	{
		for(Integer i=0;i<nums.size();i++)
		{
			Integer x=nums.get(i);
			for(Integer j=i+1;j<nums.size();j++)
			{
				if(x==nums.get(j))
				{
					System.out.println(0);
					nums.remove(j);
				}
			}
		}
		return nums;
	}
}
