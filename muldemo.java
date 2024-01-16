class muldemo
{
	public static void main(String args[])
	{
		result r = new result();
		r..display();
		r.disp();
		r.total();
	}
	
}
class student {
	int roll;
	void getdetail(int x)
	{
		
		roll=x;
	}
    void display() {
      System.out.println("roll display:"+roll);
   }
}
class mark extends student {
	int m1,m2;
	void getmark(int x,int y)
	{
		
		m1=x;
		m2=y;
	}
	
    void disp() {
      System.out.println("m1 marks:"+m1);
	  System.out.println("m2 marks:"+m2);
   }
}
class result extends student {
	int total;
	
	void total()
	{
		
		total=m1+m2;
		
	}
	
    void disp() {
      System.out.println("total is:"+total);
   }
}