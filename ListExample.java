import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;

public class ListExample {
	
	ListExample(){
		
		Frame f = new Frame();
		
		List li = new List(5);
		li.add("Item 1");
		li.add("Item 2");
		li.add("Item 3");
		li.add("Item 4");
		li.add("Item 5");
		li.setBounds(100, 100, 75, 75);
	
	
		f.add(li);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ListExample();

	}

}
