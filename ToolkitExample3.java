import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

//Changing the TitleBar Icon
public class ToolkitExample3 {
	
	ToolkitExample3(){
		
		Frame f = new Frame();
		
		Image icon = Toolkit.getDefaultToolkit().getImage("E://logo.jpg");
		
		f.setIconImage(icon);
		
		f.setLayout(null);
		
		f.setSize(400, 400);
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ToolkitExample3();

	}

}
