import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowExample3 extends Frame implements WindowListener{
	
	WindowExample3(){
	
	addWindowListener(this);
	
	setSize(400,400);
	setLayout(null);
	setVisible(true);

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new WindowExample3();
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
