import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MenuTest
{
	public static void main(String[] args)
	{
		MenuFrame frame = new MenuFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}
}

class MenuFrame extends JFrame
{
	public MenuFrame()
	{
		setTitle("Prueba de Menu");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		JMenu fileMenu = new JMenu("Archivo");
		JMenuItem newItem = fileMenu.add(new TestAction("Nuevo"));
		JMenuItem openItem = fileMenu.add(new TestAction("Abrir"));
		saveAction = new TestAction("Guardar");
		JMenuItem saveItem = fileMenu.add(saveAction);
		saveAsAction = new TestAction("Guardar Como");
		JMenuItem saveAsItem = fileMenu.add(saveAsAction);
		fileMenu.add(new AbstractAction("Salir") {
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		});
		Action cutAction = new TestAction("Cortar");
		Action copyAction = new TestAction("Copiar");
		Action pasteAction = new TestAction("Pegar");
		JMenu editMenu = new JMenu("Editar");
		editMenu.add(cutAction);
		editMenu.add(copyAction);
		editMenu.add(pasteAction);
		JMenu helpMenu = new JMenu("Ayuda");
		JMenuItem indexItem = new JMenuItem("Indice");
		helpMenu.add(indexItem);
		Action aboutAction = new TestAction("Acerca");
		helpMenu.add(aboutAction);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		popup = new JPopupMenu();
		popup.add(cutAction);
		popup.add(copyAction);
		popup.add(pasteAction);
		getContentPane().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent event)
			{
				if (event.isPopupTrigger())
					popup.show(event.getComponent(), event.getX(), event.getY());
			}
			public void mouseReleased(MouseEvent event)
			{
				if (event.isPopupTrigger())
				{
					popup.show(event.getComponent(), event.getX(), event.getY());
				}
			}
		});
	}

	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	private Action saveAction;
	private Action saveAsAction;
	private JPopupMenu popup;
}

class TestAction extends AbstractAction
{
	public TestAction(String name)
	{
		super(name);
	}

	public void actionPerformed(ActionEvent event)
	{
		System.out.println(getValue(Action.NAME) + " selected.");
	}
}