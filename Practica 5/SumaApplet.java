import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class SumaApplet extends JApplet {

	private double resultado;

	public void init()
	{
		String primeroperando;
		String segundooperando;
		double numero01;
		double numero02;

		primeroperando = JOptionPane.showInputDialog("Digitar el primer valor");
		segundooperando = JOptionPane.showInputDialog("Digitar el segundo valor");

		numero01 = Double.parseDouble(primeroperando);
		numero02 = Double.parseDouble(segundooperando);
		resultado = numero01 + numero02;
	}

	public void paint(Graphics g)
	{
		g.drawRect(15, 10, 270, 20);
		g.drawString("La suma es " + resultado, 25, 25);
	}
}