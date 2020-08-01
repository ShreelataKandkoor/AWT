import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyAdapterExample extends KeyAdapter {
	
	Frame f;
	Label l;
	TextArea area;
	
	KeyAdapterExample(){
		
		f = new Frame("Key Adapter");
		l = new Label();
		l.setBounds(20,50,300,30);
		
		area = new TextArea();
		area.setBounds(20, 80, 300, 300);
		area.addKeyListener(this);
		
		f.add(l);
		f.add(area);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new KeyAdapterExample();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		String text = area.getText();
		String words[]= text.split("\\s");
		l.setText("Words:"+words.length+"Characters:"+text.length());
	}

}
