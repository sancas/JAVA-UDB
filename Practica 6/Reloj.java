import javax.swing.JLabel;

public class Reloj extends javax.swing.JFrame
{
	private javax.swing.JLabel jlbHoraActual;
	private javax.swing.Timer timerl;
	private JLabel jlbHoraMilitar;

	public Reloj()
	{
		initComponents();
		setSize(290, 260);
		setTitle("Reloj Electronico");
		initOthersComponents();
	}

	private void initComponents()
	{
		jlbHoraActual = new javax.swing.JLabel();
		jlbHoraMilitar = new javax.swing.JLabel();

		getContentPane().setLayout(null);
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				exitForm(evt);
			}
		});
		jlbHoraActual.setFont(new java.awt.Font("Arial", 1, 24));
		jlbHoraActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jlbHoraActual.setText("00:00:00 a.m.");
		getContentPane().add(jlbHoraActual);
		jlbHoraActual.setBounds(40, 80, 210, 40);
		jlbHoraMilitar.setFont(new java.awt.Font("Arial", 1, 24));
		jlbHoraMilitar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		getContentPane().add(jlbHoraMilitar);
		jlbHoraMilitar.setBounds(30, 120, 210, 40);
		pack();

	}

	private void exitForm(java.awt.event.WindowEvent evt)
	{
		System.exit(0);
	}

	private void initOthersComponents()
	{
		java.awt.event.ActionListener al = new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				onTimer();
			}
		};
		timerl = new javax.swing.Timer(1000, al);
		timerl.start();
	}

	private void onTimer()
	{
		java.util.Date hora = new java.util.Date();
		String patron = "kk:mm:ss";
		java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat(patron);
		jlbHoraActual.setText(formato.format(hora));

		patron = "hh:mm:ss a";
		formato = new java.text.SimpleDateFormat(patron);
		jlbHoraMilitar.setText(formato.format(hora));
	}

	public static void main(String[] args)
	{
		new Reloj().setVisible(true);
	}
}