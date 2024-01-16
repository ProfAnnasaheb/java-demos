class threadprio extends Thread
{
	public static void main(String args[])
	{
		System.out.println("main class old thread priotiy is:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("main class new thread priotiy is:"+Thread.currentThread().getPriority());
		threadprio t=new threadprio();
		t.start();
	}
	
	public void run(){
		System.out.println("child thread is running");
		System.out.println("child class old thread priotiy is:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("child class NEW thread priotiy is:"+Thread.currentThread().getPriority());
		
		
	}
	
}