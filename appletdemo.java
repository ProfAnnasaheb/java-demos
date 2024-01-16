import java.util.*;
class appletdemo
{
	
	public static void main(String args[])
	{
			try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for var x:");
		int x=sc.nextInt();
		System.out.println("Enter value for var y:");
		int y=sc.nextInt();
		System.out.println("Division:"+(x/y));
			}
			
			/*catch(ArithmeticException ae)
			{
				
				System.out.println("Denominator is zero");
				
			}
			catch(InputMismatchException ne)
			{
				
				System.out.println("please enter numbers only");
				
			}*/
			catch(Exception e)
			{
				
				System.out.println("Denominator is zero OR please enter numbers only");
				
			}
			
	}
	
}