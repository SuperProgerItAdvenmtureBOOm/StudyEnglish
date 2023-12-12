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
    public AddNewWordActionListener(JTextField engTextField, JTextField rusTextField,JFrame frame) {
        // 1040 - 1103 russian symbols
        // 65-90
        String english = engTextField.getText();
        String russian = rusTextField.getText();
        //if typed texts have symbols that are not dedicated to their alphabet - an exception throws
            for(char element :english.toCharArray()){
                if(((int)element > 90 && (int)element < 65)||((int)element > 97 && (int)element < 122)) {
                    try {
                        throw new WrongInputWordException();
                    } catch (WrongInputWordException e) {
                        e.printWarning();
                    }
                }
            }
            for(char element :russian.toCharArray()) {
                if (((int) element < 1040 && (int) element > 1103)) {
                    try {
                        throw new WrongInputWordException();
                    } catch (WrongInputWordException e) {
                        e.printWarning();
                    }
                }
            }

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
