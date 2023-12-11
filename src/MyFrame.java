import ActionListeners.MyAddButtonListener;

import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import java.awt.*;
import java.awt.event.*;
import java.security.Key;


public class MyFrame extends JFrame {
    MyFrame(){

            ImageIcon square = new ImageIcon("orangeSquare2.png");//properties:400x220
            ImageIcon[] pluses = {new ImageIcon("plus.png"),new ImageIcon("plus2.png"),
                    new ImageIcon("plus3.png"),new ImageIcon("plus4.png")};//properties:50x50

                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setSize(GameProperties.BOARD_LENGTH, GameProperties.BOARD_WIDTH);
                this.setResizable(false);
                this.setLocationRelativeTo(null);
                this.getContentPane().setBackground(Color.white);//Properties
                this.setLayout(null);
            JLabel cardLabel = new JLabel();
            cardLabel.setIcon(square);
            cardLabel.setLocation(GameProperties.BOARD_LENGTH/2- GameProperties.CARD_LABEL_WIDTH/2,100);
            cardLabel.setSize(GameProperties.CARD_LABEL_WIDTH, GameProperties.CARD_LABEL_HEIGHT);

            JTextField inputField = new JTextField();
            inputField.setLocation(GameProperties.BOARD_LENGTH/2- GameProperties.TEXT_FIELD_WIDTH/2,400);
            inputField.setSize(GameProperties.TEXT_FIELD_WIDTH, GameProperties.TEXT_FIELD_HEIGHT);
            inputField.getActionForKeyStroke(KeyStroke.getKeyStroke(GameProperties.INPUT_CHAR));
            inputField.setBackground(GameProperties.MyColor.SECOND_COLOR);
            inputField.setForeground(GameProperties.MyColor.BASIC_COLOR);
            inputField.setCaretColor(GameProperties.MyColor.BASIC_COLOR);
            inputField.setBorder(BorderFactory.createEmptyBorder());
            inputField.setFont(new Font("Times New Roman",Font.PLAIN,30));

            JButton addButton = new JButton();
            addButton.setLocation(720,10);
            addButton.setSize(GameProperties.ADD_BUTTON_SIZE, GameProperties.ADD_BUTTON_SIZE);
            addButton.setIcon(pluses[0]);
            addButton.setFocusPainted(false);
            addButton.setContentAreaFilled(false);
            addButton.setBorderPainted(false);
            MyAddButtonListener listener = new MyAddButtonListener(addButton,pluses);
            addButton.addMouseListener(listener);


                this.setVisible(true);
                this.add(cardLabel);
                this.add(inputField);
                this.add(addButton);
    }
}


