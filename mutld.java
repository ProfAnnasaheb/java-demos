import java.util.Scanner;
class mutld
{
	
	public static void main(String args[])
	{
		c aa=new c();
		aa.input();
		aa.getdata();
		aa.add();
	}
}

class a
{
	
	int a;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number for a:");
		a=sc.nextInt();
	}
	
	
}
class b extends a
{
	int b;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number for b:");
		b=sc.nextInt();
		
	}
		
}
class c extends b 
{
	void add()
	{
		int c;
		c=a+b;
		System.out.println("addition is:"+c);
		
	}
	
}