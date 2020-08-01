import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

public class MouseMotionAdapterExample extends MouseMotionAdapter{
	
	Frame f;
	
	MouseMotionAdapterExample(){
		
		f = new Frame("Mouse Motion Adapter");
		f.addMouseMotionListener(this);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void mouseDragged(MouseEvent e) {
		
		Graphics g = f.getGraphics();
		g.setColor(Color.ORANGE);
		g.fillOval(e.getX(), e.getY(), 20, 20);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MouseMotionAdapterExample();

	}

}
