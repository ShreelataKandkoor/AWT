import java.awt.Button;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolkitExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f = new Frame("ToolkitExample");
		
		Button b = new Button("beep");
		
		b.setBounds(51,100,60,30);
		
		f.add(b);
		
		f.setSize(300,300);
		
		f.setLayout(null);
		
		f.setVisible(true);
		
		b.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Toolkit.getDefaultToolkit().beep();
			}
			
			
		});
		

	}

}
