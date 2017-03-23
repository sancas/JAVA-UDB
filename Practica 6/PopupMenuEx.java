import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopupMenuEx extends JFrame {
	private JPopupMenu pmenu;

	public PopupMenuEx()
	{
		initUI();
	}

	private void initUI()
	{
		createPopupMenu();
		setTitle("JPopupMenu");
		setSize(300, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void createPopupMenu()
	{
		pmenu = new JPopupMenu();
		JMenuItem maxMi = new JMenuItem("Maximizar");
		maxMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (getExtendedState() != JFrame.MAXIMIZED_BOTH) {
					setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
			}
		});
		pmenu.add(maxMi);
		JMenuItem quitMi = new JMenuItem("Salir");
		quitMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		pmenu.add(quitMi);
		addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON3) {
					pmenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				PopupMenuEx pm = new PopupMenuEx();
				pm.setVisible(true);
			}
		});
	}
}