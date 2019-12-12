package sample;

public class Sum 
{
 public static int sumDouble(int a,int b)
 {
	 int sum=a+b;
	 
	 if (a==b)
	 {
		 sum=sum*2;
	 }
	 return sum;
 }
 public static void main(String[]args)
 {
	 int k=sumDouble(1,1);
	 System.out.println(k);
 }
}
