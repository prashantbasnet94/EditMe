/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

import javax.swing.JFrame;

/**
 *
 * @author Led-Zepplin
 */
public class TextEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TextEditorFrame text=new TextEditorFrame();
        text.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text.setLocationRelativeTo(null);
        text.setTitle("Prashant");
        text.setVisible(true);
    }
    
}
