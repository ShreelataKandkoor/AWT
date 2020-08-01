import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AEvent extends Frame implements ActionListener{
	
	TextField tf;
	
	AEvent(){
		
		//create components
		tf = new TextField();
		
		tf.setBounds(60,50,170,20);
		
		Button b = new Button("click me");
		
		b.setBounds(100,120,80,30);
		
		
		//register listener
		b.addActionListener(this); //passing current instance
		
		
		//add components and set size, layout and visibility
		add(b);add(tf);
		setSize(300,300);
		
		setLayout(null);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tf.setText("Welcome");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new AEvent();

	}

	

}
