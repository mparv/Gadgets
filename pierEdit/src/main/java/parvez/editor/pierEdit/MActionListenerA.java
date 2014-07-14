/**Author : Parvez
 * IIIT Allahabad
 */

package parvez.editor.pierEdit;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

/**
 * Action Listener for Open menu 
 * @author parvez
 *
 */
public class MActionListenerA implements ActionListener {
	TextArea textArea1;
	
	public MActionListenerA(TextArea textArea1) {
		this.textArea1 = textArea1;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		JFileChooser jFileChooser1 = new JFileChooser();
		jFileChooser1.showDialog(null, null);
		
		try {
			FileReader fileReader1 = new FileReader(jFileChooser1.getSelectedFile().getAbsolutePath());
			String line;
			BufferedReader br = new BufferedReader(fileReader1);
			String str = "";
			while ((line = br.readLine()) != null) {
				str += line + "\n";
			}
			textArea1.setText(str);
			br.close();
			fileReader1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

