import java.applet.*;
import java.awt.*;

public class ParametrosApplet extends Applet
{
	String n;
	String a;

	public void init()
	{
		n = getParameter("nombre");
		a = getParameter("edad");
		if (n == null)
			n = " ";
		if (a == null)
			a = " ";
	}

	public void paint(Graphics g)
	{
		g.drawString(n + " es un estudiante especializado en ingenieria", 20, 40);
		g.drawString(n + " tiene " + a + " años", 20, 60);
	}
}