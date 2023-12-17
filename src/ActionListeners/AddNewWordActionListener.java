package ActionListeners;

import MyExceptions.WrongInputWordException;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.*;
import static java.lang.System.exit;

public class AddNewWordActionListener implements ActionListener {
    JTextField engTextField;
    JTextField rusTextField;
    public AddNewWordActionListener(JTextField engTextField, JTextField rusTextField,JFrame frame) {
        // 1040 - 1103 russian symbols
        // 65-90
        this.engTextField = engTextField;
        this.rusTextField = rusTextField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//if typed texts have symbols that are not dedicated to their alphabet - an exception throws
        String english = engTextField.getText();
        String russian = rusTextField.getText();
        boolean engWarningFlag = false;
        boolean rusWarningFlag = false;
        for(char element :english.toCharArray()){
            if(((int)element < 65 || (int)element > 90 )&&((int)element < 97 || (int)element > 122)) {
                engWarningFlag = true;
            }
        }
        for(char element :russian.toCharArray()) {
            if (((int) element < 1040 || (int) element > 1103)) {
                rusWarningFlag = true;
            }
        }
        //in case of wrong input
                if (rusWarningFlag || engWarningFlag) {
                    try {
                        throw new WrongInputWordException();
                    } catch (WrongInputWordException ex) {
                        ex.printWarning();
                    }
                    //if there is a mistake in some field - reset to zero
                    if(engWarningFlag)
                        engTextField.setText("");
                    if(rusWarningFlag)
                        rusTextField.setText("");
                }
                else {

                    //otherwise
                    //logic of writing info into a file;
                    //
                    System.exit(0);
                }
    }
}
