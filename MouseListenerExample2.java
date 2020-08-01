import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample2 extends Frame implements MouseListener{
	
	
	MouseListenerExample2(){
		
		Frame f = new Frame();
		
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
		addMouseListener(this);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MouseListenerExample2();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(), e.getY(), 30, 30);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
