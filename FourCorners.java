import javax.swing.JFrame;

public class FourCorners {
	private static final int WIDTH=1600;
	private static final int HEIGHT = 960;

	public FourCorners(String title) {
		super(title);
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new FourCornersPanel);
		setVisible(true);
	}
}
