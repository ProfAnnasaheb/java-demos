class test1 implements Runnable
{
public void run()
{
	
	for(int i=1;i<=5;i++)
	{
		System.out.println("test1 thread running");
		
	}
}
	
}

class maintest{
	public static void main(String args[])
	{
		test1 t=new test1();
		Thread obj=new Thread(t);
		obj.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("main thread is running");
			
		}
		
	}
	
}