import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f = new Frame();
		
		f.setSize(400, 400);
		
		f.setLayout(null);
		
		f.setVisible(true);
		
		Button b = new Button("click me");
		
		b.setBounds(100, 100, 60, 30);
		
		f.add(b);
		
		final TextField tf = new TextField();
		
		tf.setBounds(50, 50, 150, 20);
		
		f.add(tf);
		
		b.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				tf.setText("Welcome to java.");
			}
			
		});
		

	}

}
