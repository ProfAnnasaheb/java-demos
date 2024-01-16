import java.util.*;
class test
{
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nenter value of a:");
		int a=sc.nextInt();
		System.out.println("\nenter value of b:");
		float b=sc.nextFloat();
		
		overload o=new overload();
		o.getrate(a);
		o.getrate(a,b);
	
	}

	
}	