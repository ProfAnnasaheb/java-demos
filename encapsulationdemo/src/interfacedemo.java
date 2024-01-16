
interface interfacedemo {
     void show();// bydefault public
     default void display()// allowded because of default and static alloeded
     {
     System.out.println("2");
    }
}
class test implements interfacedemo
{
   public void show() //public required becuase bydefault public  
    {
    
        System.out.println("1");
    }
    public static void main(String args[])
    {
        test t=new test();
        t.show();
    }
}

//output: 1