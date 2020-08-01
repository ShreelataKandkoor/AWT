import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelExample {
	
	PanelExample(){
		
		Frame f = new Frame();
		
		Panel p = new Panel();
		p.setBounds(40, 80, 200, 200);
		p.setBackground(Color.gray);
		
		Button b1 = new Button("Button 1");
		b1.setBounds(50, 100, 80, 30);
		b1.setBackground(Color.yellow);
		
		Button b2 = new Button("Button 2");
		b2.setBounds(100, 100, 80, 30);
		b2.setBackground(Color.blue);
		
		p.add(b1);p.add(b2);
		f.add(p);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new PanelExample();

	}

}
