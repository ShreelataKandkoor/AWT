import java.awt.Frame;
import java.awt.Scrollbar;

public class ScollbarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f = new Frame("Scollbar Example");
		
		Scrollbar s = new Scrollbar();
		
		s.setBounds(100,100,50,100);
		
		f.add(s);
		
		f.setSize(400, 400);
		
		f.setLayout(null);
		
		f.setVisible(true);

	}

}
