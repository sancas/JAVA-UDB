import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CasillaVerificacion extends JFrame {
	private JTextField campo;
	private JCheckBox negrita, cursiva;

	public CasillaVerificacion() {
		super("Prueba de JCheckBox");

		Container contenedor = getContentPane();
		contenedor.setLayout(new FlowLayout());

		campo = new JTextField("observe el cambio en el "
			+ "estilo de tipo de letra", 25);
		campo.setFont(new Font("Serif", Font.PLAIN, 14));
		contenedor.add(campo);

		negrita = new JCheckBox("Negrita");
		contenedor.add(negrita);

		cursiva = new JCheckBox("Cursiva");
		contenedor.add(cursiva);

		ManejadorCasillaVerificacion manejador = new ManejadorCasillaVerificacion();
		negrita.addItemListener(manejador);
		cursiva.addItemListener(manejador);

		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		CasillaVerificacion aplicacion = new CasillaVerificacion();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class ManejadorCasillaVerificacion implements ItemListener
	{
		private int valNegrita = Font.PLAIN;
		private int valCursiva = Font.PLAIN;

		public void itemStateChanged(ItemEvent evento)
		{
			if (evento.getSource() == negrita)
				valNegrita = negrita.isSelected()? Font.BOLD : Font.PLAIN;

			if (evento.getSource() == cursiva)
				valCursiva = cursiva.isSelected()? Font.ITALIC : Font.PLAIN;

			campo.setFont(new Font("Serif", valNegrita + valCursiva, 14));
		}
	}
}