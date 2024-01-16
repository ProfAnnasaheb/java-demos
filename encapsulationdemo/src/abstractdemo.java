
 abstract class abstractdemo {
    
    abstract void start();
        
}

 class car extends abstractdemo
{
    
    void start()
    {
    
        System.out.println("start with key");
    }

}
class scooter extends abstractdemo
{
    void start()
    {
    
        System.out.println("start with kick");
    }
    public static void main(String args[])
    {
       // abstractdemo a=new abstractdemo();
       car c=new car ();
        c.start();
        scooter s=new scooter();
        s.start();                 
        
    }
}
