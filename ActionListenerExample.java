import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample{
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f = new Frame("ActionListener EXample");
		
		final TextField tf = new TextField();
		tf.setBounds(50, 50, 150, 20);
		
		Button b = new Button("Click here");
		b.setBounds(50, 100, 60, 30);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText("Welcome to Home..");
				
			}
			
			
		});
		
		f.add(tf);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		
		

	}

	
	

}
