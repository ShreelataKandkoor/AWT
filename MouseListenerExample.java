import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample extends Frame implements MouseListener{
	
	Label l;
	MouseListenerExample(){
		
		l = new Label();
		l.setBounds(20, 50, 100, 20);
		add(l);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		addMouseListener(this);
	}
	
	public static void main(String args[]) {
		
		new MouseListenerExample();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Presses");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Released.");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Exited.");
	}

}
