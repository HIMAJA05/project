package sample;

;public class Samp 
{
	public static  boolean SleepIn(boolean weekday,boolean vacation)
	{
		if(!weekday||vacation)
		{
			return true;
			
		}
		return false;
	}
  public static void main (String [] args)
 {
	boolean a=SleepIn(true,false);
	System.out.println(a);
	
 }
}
