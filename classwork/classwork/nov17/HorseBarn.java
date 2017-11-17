package nov17;

public class HorseBarn {
	private Horse[] spaces;
	public HorseBarn(Horse[] spaces)
	{
		this.spaces=spaces;
	}
	public int findHorseSpace(String name)
	{
		for(int i=0;i<this.spaces.length;i++)
		{
			if((this.spaces[i]!=null)&&name.equals(this.spaces[i].getName()))
			{
				return i;
			}
		}
		return -1;
	}
	public void consolidate()
	{
		for(int i=0;i<this.spaces.length;i++)
		{
			for(int j=i;j<this.spaces.length-1;j++)
			{
				this.spaces[j]=this.spaces[j+1];
			}
			this.spaces[this.spaces.length-1]=null;
		}
	}
	public String printbarn()
	{
		String horses="";
		for(int i=0;i<this.spaces.length;i++)
		{
			if((this.spaces[i]!=null))
				horses+="["+this.spaces[i].getName()+"] ";
			else
				horses+="[null] ";
		}
		return horses;
	}
}
