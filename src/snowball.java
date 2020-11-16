
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
public class snowball {
	
	private int x;
	private int y;
	private int w;
	private int h;
	private boolean visible;
	private Image image;
	private Rectangle rect;
	private int speed=5;
	private String enemy;
	public snowball(int x, int y) {
	
		ImageIcon ic = new ImageIcon("images/snowball.png");
		image=ic.getImage();
		this.x=x;
		this.y=y;
		w=image.getWidth(null);
		h=image.getHeight(null);
		y=-h;
		rect=new Rectangle(x,y,200,200);
	
	
	}
		
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return w;
	}
	public int getHeigh() {
		return h;
	}
	public Image getImage() {
		return image;
	}
	public void move() {
		y-=speed;
		rect.y=y;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible=visible;
	}
	public Rectangle getBounds() {
		
		return rect;
	}
	
	
	
}
