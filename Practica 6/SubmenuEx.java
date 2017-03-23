import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SubmenuEx extends JFrame {
	public SubmenuEx()
	{
		initUI();
	}

	private void initUI()
	{
		createMenuBar();
		setTitle("Submenu");
		setSize(360, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createMenuBar()
	{
		JMenuBar menubar = new JMenuBar();
		JMenu fileMenu = new JMenu("Archivo");
		JMenu impMenu = new JMenu("Importar");
		JMenuItem newfMi = new JMenuItem("Importar lista de fuentes...");
		JMenuItem bookmMi = new JMenuItem("Importar marcas...");
		JMenuItem mailMi = new JMenuItem("Importar correo...");
		impMenu.add(newfMi);
		impMenu.add(bookmMi);
		impMenu.add(mailMi);
		JMenuItem newMi = new JMenuItem("Nuevo");
		JMenuItem openMi = new JMenuItem("Abrir");
		JMenuItem saveMi = new JMenuItem("Guardar");
		JMenuItem exitMi = new JMenuItem("Salir");
		exitMi.setToolTipText("Salir de Aplicacion");
		exitMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		fileMenu.add(newMi);
		fileMenu.add(openMi);
		fileMenu.add(saveMi);
		fileMenu.addSeparator();
		fileMenu.add(impMenu);
		fileMenu.addSeparator();
		fileMenu.add(exitMi);
		menubar.add(fileMenu);
		setJMenuBar(menubar);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				SubmenuEx ex = new SubmenuEx();
				ex.setVisible(true);
			}
		});
	}
}