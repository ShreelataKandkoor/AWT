import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowExample2 implements WindowListener {
	
	Frame f;
	
	WindowExample2(){
		
		f = new Frame();
		f.addWindowListener(this);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	//closing window by extending windowAdapter
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new WindowExample2();

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		f.dispose();
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
