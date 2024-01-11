package ActionListeners;

import Checks.TranslationCheck;
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
    JFrame currentFrame;
    public AddNewWordActionListener(JTextField engTextField, JTextField rusTextField,JFrame frame) {
        // 1040 - 1103 russian symbols
        // 65-90
        this.engTextField = engTextField;
        this.rusTextField = rusTextField;
        currentFrame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//if typed texts have symbols that are not dedicated to their alphabet - an exception throws
        String english = engTextField.getText();
        String russian = rusTextField.getText();
        boolean engWarningFlag ;
        boolean rusWarningFlag ;
        engWarningFlag = TranslationCheck.EnglishWordCheck(english)?false:true;
        rusWarningFlag = TranslationCheck.RussianWordCheck(russian)?false:true;
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
                    currentFrame.setVisible(false);
                }
    }
}
