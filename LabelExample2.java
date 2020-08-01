import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class LabelExample2 extends Frame implements ActionListener{
	
	TextField tf; Label l; Button b;
	
	LabelExample2(){
		tf = new TextField();
		
		tf.setBounds(50, 50, 100, 20);
		
		l = new Label();
		
		l.setBounds(50, 100, 250, 20);
		
		b = new Button("Find IP");
		
		b.setBounds(50,150,60,30);
		
		add(tf);add(l);add(b);
		
		setSize(400,400);
		
		setLayout(null);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new LabelExample2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String host = tf.getText();
		
		try {
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			
			l.setText("IP of"+host+"is:"+ip);
			
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
