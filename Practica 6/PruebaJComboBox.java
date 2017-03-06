import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JLabel;

public class PruebaJComboBox {
	private JTextField tf;
	private JComboBox combo;
	private JFrame v;

	public PruebaJComboBox()
	{
		tf = new JTextField(20);
		JLabel etiqueta = new JLabel("Seleccione a que carrera pertenece:");
		etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT);

		combo = new JComboBox();
		combo.addItem("Computacion");
		combo.addItem("Mecatronica");
		combo.addItem("Telecomunicaciones");

		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(combo.getSelectedItem().toString());
			}
		});

		v = new JFrame("Ejemplo utilizando JComboBox");
		v.getContentPane().add(etiqueta);
		v.getContentPane().setLayout(new FlowLayout());
		v.getContentPane().add(combo);
		v.getContentPane().add(tf);

		v.pack();
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		new PruebaJComboBox();
	}
}