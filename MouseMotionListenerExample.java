import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerExample extends Frame implements MouseMotionListener{
	
	MouseMotionListenerExample(){
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
		addMouseMotionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MouseMotionListenerExample();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(), e.getY(), 20, 20);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
