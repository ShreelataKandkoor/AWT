import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListExample2 {
	
	ListExample2(){
		
		Label label = new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(500, 500);
		Button b = new Button("click me");
		b.setBounds(200, 150, 80, 30);
		
		final List li = new List(5,false);
		li.setBounds(100, 200, 70, 70);
		li.add("Mango");
		li.add("Apple");
		li.add("Grapes");
        li.add("Orange");
        li.add("Banana");
        
        final List li2 = new List(5,true);
		li2.setBounds(100, 200, 70, 70);
		li2.add("C++");
		li2.add("Java");
		li2.add("Android");
        li2.add("Hibernate");
        li2.add("Spring");
        
        
		Frame f = new Frame();
		f.setSize(450, 450);
		f.setLayout(null);
		f.setVisible(true);
		f.add(li);
		f.add(li2);
		f.add(b);
		f.add(label);
		
		b.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String data = "Selected Item from List is:"+li.getItem(li.getSelectedIndex());
				data+=",Selected";
				
				for(String frame:li2.getSelectedItems()) {
					
					data+=frame+"";
				}
				
				label.setText(data);
			}
			
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ListExample2();

	}

}
