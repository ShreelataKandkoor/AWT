import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerExample extends Frame implements ItemListener{
	
	Checkbox checkbox1,checkbox2;
	Label label;
	
	ItemListenerExample(){
		
		Frame f = new Frame("CheckBox Example");
		
		label  = new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400,100);
		
		checkbox1 = new Checkbox("C++");
		checkbox2 = new Checkbox("Java");
		
		checkbox1.setBounds(100, 150, 50, 50);
		checkbox2.setBounds(100, 100, 50, 50);
		
		checkbox1.addItemListener((ItemListener) this);
		checkbox2.addItemListener((ItemListener) this);
		
		add(checkbox1);
		add(checkbox2);
		add(label);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ItemListenerExample();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==checkbox1)
			
			label.setText("C++ Checkbox:" 
					+(e.getStateChange()==1?"checked":"unchecked"));
		
if(e.getSource()==checkbox2)
			
			label.setText("Java Checkbox:" 
					+(e.getStateChange()==1?"checked":"unchecked"));
		
	}

}
