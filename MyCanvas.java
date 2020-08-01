import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

public class MyCanvas extends Canvas {
	
	public MyCanvas() {
		
		setBackground(Color.DARK_GRAY);
		setSize(300,200);
	}
	
	
	public void paint(Graphics g) {
		
		g.setColor(Color.red);
		g.fillOval(75,75,150,75);
	}

}
