import java.awt.Button;
import java.awt.Frame;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f = new Frame("Button Example");
		
		Button b = new Button("click here");
		
		b.setBounds(50, 100, 80, 30);
		
		f.add(b);
		
		f.setBounds(50, 100, 80, 30);
		
		f.setSize(400, 400);
		
		f.setLayout(null);
		
		f.setVisible(true);

	}

}
