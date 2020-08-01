import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxGroupExample2{
	
	CheckBoxGroupExample2(){
		
		Frame f = new Frame();
		
		final Label label = new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400, 100);
		
		label.setSize(400, 100);
		
		CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox checkBox1 = new Checkbox("C++", cbg, false);    
        checkBox1.setBounds(100,100, 50,50);    
        Checkbox checkBox2 = new Checkbox("Java", cbg, false);    
        checkBox2.setBounds(100,150, 50,50);
        
        checkBox1.addItemListener((ItemListener) new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				label.setText("C++ checkbox: Checked");
			}
        	
        });
        
        checkBox2.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				label.setText("Java checkbox: Checked");
				
			}
        	
        	
        });
        
        
        
        
        f.add(checkBox1);    
        f.add(checkBox2);
        f.add(label);
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CheckBoxGroupExample2();

	}

}
