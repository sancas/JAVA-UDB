import java.applet.*;
import java.awt.*;

public class MiApplet extends Applet
{
	@Override
	public void paint(Graphics g)
	{
		g.drawString("Hola, este es mi primer Applet en JAVA", 50, 100);
	}
}