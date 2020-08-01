import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceExample2 {
	
	ChoiceExample2(){
		
		Frame f = new Frame();
		
		Label label = new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400, 100);
		
		Button b = new Button("show");
		b.setBounds(200, 100, 75, 75);
		
		
		Choice c = new Choice();
		c.setBounds(100, 100, 75, 75);
		c.add("Mango");
		c.add("Apple");
		c.add("Orange");
		c.add("Grapes");
		c.add("Banana");
		f.add(c);
		f.add(label);
		f.add(b);
		
		
		b.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			String data = "Programming language Selected:"+c.getItem(c.getSelectedIndex());
			label.setText(data);
			}
			
		});
		
		
		
		
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ChoiceExample2();

	}

}
