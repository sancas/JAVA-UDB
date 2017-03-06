import javax.swing.JFrame;

public class FrameSencillo extends JFrame {
	public FrameSencillo() {
		super("Mi Primer Frame");
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		FrameSencillo sf = new FrameSencillo();
	}
}