import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowsExample extends Frame implements WindowListener{
	
	WindowsExample(){
		
		addWindowListener(this);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new WindowsExample();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Opened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Closing");
		dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Iconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Deciconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Activated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Deactivied");
	}

}
