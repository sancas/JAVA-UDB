import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Conversor extends javax.swing.JFrame {
	private JLabel jlbGradosC;
	private JTextField jtfGradosC;
	private JLabel jlbGradosF;
	private JTextField jtfGradosF;
	private JButton jbtAceptar;

	public Conversor()
	{
		setSize(300, 200);
		setTitle("Conversion de temperaturas");
		initComponents();
	}

	private void initComponents() {
		jlbGradosC = new JLabel();
		jtfGradosC = new JTextField();
		jlbGradosF = new JLabel();
		jtfGradosF = new JTextField();
		jbtAceptar = new JButton();

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				exitForm(evt);
			}

			public void windowOpened(WindowEvent evt) {
				formWindowOpened(evt);
			}
		});
		getContentPane().setLayout(null);

		this.jlbGradosC.setText("Centigrados");
		getContentPane().add(this.jlbGradosC);
		this.jlbGradosC.setBounds(12, 28, 116, 14);

		getContentPane().add(this.jtfGradosC);
		this.jtfGradosC.setBounds(132, 28, 144, 20);

		this.jlbGradosF.setText("Fahrenheit");
		getContentPane().add(this.jlbGradosF);
		this.jlbGradosF.setBounds(12, 68, 104, 24);

		this.jtfGradosF.setHorizontalAlignment(JTextField.RIGHT);
		getContentPane().add(this.jtfGradosF);
		this.jtfGradosF.setBounds(132, 72, 144, 20);

		this.jbtAceptar.setMnemonic('A');
		this.jbtAceptar.setText("Convertir");
		getRootPane().setDefaultButton(jbtAceptar);
		this.jbtAceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				jbtAceptarActionPerformed(evt);
			}
		});
		getContentPane().add(this.jbtAceptar);
		this.jbtAceptar.setBounds(132, 120, 144, 24);
	}

	private void jbtAceptarActionPerformed(ActionEvent evt) {
		try {
			double grados;

			if (this.jtfGradosC.getText().equals("") && this.jtfGradosF.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Ambos campos estan vacios");
			}
			else if (this.jtfGradosC.getText().equals("") && this.jtfGradosF.getText() != "")
			{
				grados = (Double.parseDouble(this.jtfGradosF.getText()) - 32) * 5/9;
				String texto = String.format("%.2f", grados);
				this.jtfGradosC.setText(texto);
			}
			else if (this.jtfGradosF.getText().equals("") && this.jtfGradosC.getText() != "")
			{
				grados = Double.parseDouble(this.jtfGradosC.getText()) * 9/5 + 32;
				String texto = String.format("%.2f", grados);
				this.jtfGradosF.setText(texto);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Solo un campo debe usar.");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	private void exitForm(WindowEvent evt) {
		System.exit(0);
	}

	private void formWindowOpened(WindowEvent evt) {
		this.jtfGradosC.requestFocus();
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			System.out.println("No se puede establecer el aspecto deseado: " + e);
		}
		new Conversor().setVisible(true);
	}
}