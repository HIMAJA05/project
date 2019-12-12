package sample;

public class Monkey 
{
	public static boolean monkeyTrouble(boolean aSmile,boolean bSmile)
	{
		if(aSmile&&bSmile)
		{
			return true;
			
		}
		return false;
	}
	public static void main(String[] args)
	{
		boolean l=monkeyTrouble(true,false);
		System.out.println(l);
		
	}

}
