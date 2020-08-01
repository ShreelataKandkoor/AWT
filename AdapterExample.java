import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AdapterExample {
	
	Frame f;
	
	AdapterExample(){
		
		f = new Frame("Window Adapter");
		f.addWindowListener((WindowListener) new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				
				f.dispose();
			}
			
		});
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new AdapterExample();
	}

}
