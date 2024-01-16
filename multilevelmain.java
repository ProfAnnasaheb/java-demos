
class student
{
	
	int roll;
	
	void getroll(int x)
	{
		
		roll=x;
	}
	
	void putroll()
	{
		
		System.out.println("roll is:"+roll);
		
	}
	
}

class marks extends student
{
		
	void getmark(int a,int b)
	{
		int m=a;
		int n=b;
	}
	
	void putmark()
	{
		System.out.println("java marks:" +m);
		System.out.println("python marks:" +n);
	}
	
	
}
class result extends marks
{
	int total;
	void disp()
	{
		putmark();
		putroll();
		
		total=m+n;
		System.out.println("total marks:"+total);
		
	}
	
	
}
class multilevelmain
{
	
	public static void main(String args[])
	{
		result obj=new result();
		obj.getroll(10);
		obj.getmark(60,70);
		obj.disp();
		
	}
	
}