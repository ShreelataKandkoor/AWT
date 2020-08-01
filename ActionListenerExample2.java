import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample2 implements ActionListener{
	
	final TextField tf;
	
	ActionListenerExample2(){
       
		Frame f = new Frame("ActionListener EXample");
		
		 tf = new TextField();
		tf.setBounds(50, 50, 150, 20);
		
		Button b = new Button("Click here");
		b.setBounds(50, 100, 60, 30);
		 b.addActionListener(this);
		
		f.add(tf);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       
		new ActionListenerExample2();
      

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		tf.setText("Welcome to Home.");
		
	}

	

	

}
