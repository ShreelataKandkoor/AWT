import java.awt.Component;
import java.awt.Frame;

public class CanvasExample {
	
	CanvasExample(){
		
		Frame f = new Frame();
		f.add(new MyCanvas());
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CanvasExample();

	}

}
