import java.applet.*;
import java.awt.*;
/*<applet code="test.class" width="200" height="200">
</applet>*/
public class test extends Applet
{
	
	String msg="welcome dear students";
	
	public void init()
	{
		msg+="init()";
	}
	
	public void start()
	{
		
		msg+="start()";
	}
	public void stop()
	{
		msg+="stop()";
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
		showStatus("testing applet");
	}
}