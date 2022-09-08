import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.image.BufferedImage;

public class FourCornersPanel extends JPanel implements MouseListener{
	private BufferedImage a,b,c,d,f,x,y,z;
	private BufferedImage choice,choice1,choice2,choice3;
	
	public FourCornersPanel() {
		try {
			a=ImageIO.read(new File("breaking_bad___jesse_1200.jpg"));
			b=ImageIO.read(new File("Lalo_Salamanca_S5.png"));
			c=ImageIO.read(new File("Mike_Ehrmantraut_BCS_S3.png"));
			d=ImageIO.read(new File("MV5BMTI0NTMwMDgtYTMzZC00YmJhLTg4NzMtMTc1NjI4MWY4NmQ4XkEyXkFqcGdeQXVyNTY3MTYzOTA@._V1_FMjpg_UX1000_.jpg"));
			f=ImageIO.read(new File("Walter_White_S5B.png"));
			x=ImageIO.read(new File("Nacho_Varga_BCS_S5.png"));
			y=ImageIO.read(new File("p35273_p_v8_av.jpg"));
			z=ImageIO.read(new File("SaulGoodman.jpg"));
		}
		catch(Exception E) {
			System.out.println("Exception Error");
			return;
		}
		choice = a;
		choice1 = b;
		choice2 = c;
		choice3 = d;
		addMouseListener(this);
	}
	public void addNotify() {
		super.addNotify();
		requestFocus();
	}
	public void paint(Graphics g) {
		//drawImage(image img, int x, int y, int width, int height, ImageObserver observer)
		g.drawImage(choice, 0, 0, 800, 800, null);
		g.drawImage(choice1, 0, 801, 800, 800, null);
		g.drawImage(choice2, 801, 801, 800, 800, null);
		g.drawImage(choice3, 801, 0, 800, 800, null);

	}
	
public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	} 
	public void mouseClicked(MouseEvent e) {
		if(e.getX() >= 0 && e.getX()<= 800 && e.getY()>=0 && e.getY() <=800) {
			choice = f;
		}
		if(e.getX() >=0 && e.getX() <=800 && e.getY() >= 801 && e.getY()<=1601) {
			choice1=x;
		}
		if(e.getX() >= 801 && e.getX() <= 1601 && e.getY() >= 801 && e.getY() <= 1601) {
			choice2=y;
		}
		if(e.getX()>=801 && e.getX()<=1601 && e.getY()>=0 && e.getY()<=800) {
			choice3=z;
		}
	}
}
