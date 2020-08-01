import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuExample {
	
	MenuExample(){
		
		Frame f = new Frame("Menu and Menu Item Example.");
		MenuBar mb = new MenuBar();
		Menu menu = new Menu("Menu");
		Menu submenu = new Menu("Sub Menu");
		
		MenuItem i1 = new MenuItem("Item 1");
		MenuItem i2 = new MenuItem("Item 2");
		MenuItem i3 = new MenuItem("Item 3");
		MenuItem i4 = new MenuItem("Item 4");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		
		submenu.add(i3);
		submenu.add(i4);
		
		menu.add(submenu);
		
		mb.add(menu);
		
		
		f.setMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MenuExample();

	}

}
