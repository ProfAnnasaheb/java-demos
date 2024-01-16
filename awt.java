import java.awt.*;
import java.awt.event.*;

class awt extends Frame   {
	
	awt()
	{
		Frame f=new Frame("my frame");
		Label l=new Label("hello");
		l.setBounds(10,80,60,10);
		f.add(l);
		Button b=new Button("click here");
		b.setBounds(30,100,80,30);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.out.println("frame closed");
				System.exit(0);
			}
		});
		
					
     
		
		
	}
	public static void main(String args[])
	{
		
		awt t=new awt();
		
	}
}

