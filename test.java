 class a extends Thread {
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("from thread A"+i);
			try{
				
				Thread.sleep(1000);
				}
				catch(Exception e)
				{
					
					
					
				}
        }
    }
}
 class bb extends Thread {
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("from thread B"+i);
			try{
				
				Thread.sleep(1000);
				}
				catch(Exception e)
				{
					
					
					
				}
        }
    }
}

class test
{
    public static void main(String args[])
    {
        a obja=new a();
        bb objb=new bb();
        obja.start();
        objb.start();
        
    }
}