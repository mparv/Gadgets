/**Author : Parvez
 * IIIT Allahabad
 */

package parvez.editor.pierEdit;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Action listener for Save menu
 * @author parvez
 *
 */
public class MActionListenerB implements ActionListener {
	TextArea textArea;
	
	public MActionListenerB(TextArea textArea) {
		this.textArea = textArea;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		FileWriter fileWriter1 = null;
		try {
			fileWriter1 = new FileWriter("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\tmp.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedWriter br = new BufferedWriter(fileWriter1);
		for (String line : textArea.getText().split("\\n")) {
			try {
				br.write(line + System.getProperty("line.separator"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
