import javax.swing.JFrame;

public class FourCorners extends JFrame{
	private static final int WIDTH=800;
	private static final int HEIGHT = 800;

	public FourCorners(String title) {
		super(title);
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new FourCornersPanel());
		setVisible(true);
	}
}
