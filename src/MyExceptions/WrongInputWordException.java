package MyExceptions;

import javax.swing.*;

public class WrongInputWordException extends Exception{
    public WrongInputWordException(){

    }

    public void printWarning() {
        JOptionPane.showMessageDialog(null,"check your input","warn",JOptionPane.WARNING_MESSAGE);
    }
}
