/**Author : Parvez
 * IIIT Allahabad
 */

package parvez.editor.pierEdit;

import java.awt.Dimension;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

import javax.swing.JFrame;

/**
 * Application class
 * @author parvez
 *
 */
public class FunctionalityTester {
	static TextArea textArea1;
	
	public static void main(String[] ar) {
		JFrame jFrame1 = new JFrame("MEditor");
		addMenu(jFrame1);
		jFrame1.setSize(new Dimension(600, 600));
		jFrame1.setVisible(true);
	}
	
	public static void addMenu(JFrame jFrame1) {
		MenuBar menuBar1 = new MenuBar();
		menuBar1.setName("M Menu");
		Menu menu1 = new Menu("File");
		
		//Adding menu items
		MenuItem menuItem1 = new MenuItem("Open");
		MenuItem menuItem2 = new MenuItem("Save");
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		menuBar1.add(menu1);
		textArea1 = new TextArea();
		jFrame1.add(textArea1);
		
		//Adding action listeners
		menuItem1.addActionListener(new MActionListenerA(textArea1));
		menuItem2.addActionListener(new MActionListenerB(textArea1));
		jFrame1.setMenuBar(menuBar1);
	}
}


