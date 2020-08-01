import java.awt.Button;
import java.awt.Frame;

///AWT example by Association
public class First2 {
	
	First2(){
		
		Frame f = new Frame();
		Button b = new Button("Click me");
		b.setBounds(30,50,80,30);
		f.add(b);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First2 f = new First2();

	}

}
