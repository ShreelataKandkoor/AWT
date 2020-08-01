import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample extends Frame implements KeyListener{
	
	Label l;
	TextArea area;
	
	KeyListenerExample(){
		
		l = new Label();
		l.setBounds(20, 50, 100, 20);
		
		area = new TextArea();
		area.setBounds(20, 80, 300, 300);
		area.addKeyListener(this);
		
		add(l);
		add(area);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new KeyListenerExample();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		l.setText("Key typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		l.setText("Key Pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		String text = area.getText();
		String words[]=text.split("\\s");
		l.setText("words:"+words.length+"Characters:"+text.length());
	}

}
