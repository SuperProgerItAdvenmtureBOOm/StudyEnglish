package Frames;

import ActionListeners.AddNewWordActionListener;
import MyExceptions.WrongInputWordException;
import Other.GameProperties;

import javax.swing.*;
import java.awt.*;

public class AddFrame extends JFrame {
    public AddFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(GameProperties.MyColor.SECOND_COLOR);//Properties
        this.setSize(400,170);

            JLabel engLabel = new JLabel("Eng");
            engLabel.setFont(new Font("Times New Roman",Font.PLAIN,30));
            engLabel.setForeground(GameProperties.MyColor.SECOND_COLOR);
            engLabel.setBackground(GameProperties.MyColor.BASIC_COLOR);
            engLabel.setSize(80,50);
            engLabel.setLocation(10,10);
            engLabel.setOpaque(true);
            engLabel.setHorizontalTextPosition(JLabel.CENTER);


            JLabel rusLabel = new JLabel("Rus");
            rusLabel.setFont(new Font("Times New Roman",Font.PLAIN,30));
            rusLabel.setForeground(GameProperties.MyColor.SECOND_COLOR);
            rusLabel.setBackground(GameProperties.MyColor.BASIC_COLOR);
            rusLabel.setSize(80,50);
            rusLabel.setLocation(10,70);
            rusLabel.setOpaque(true);
            rusLabel.setHorizontalTextPosition(JLabel.CENTER);


            JTextField inputRussianField = new JTextField();
            inputRussianField.setSize(200,50);
            inputRussianField.setLocation(100,70);
            inputRussianField.setBackground(GameProperties.MyColor.BASIC_COLOR);
            inputRussianField.setForeground(GameProperties.MyColor.SECOND_COLOR);
            inputRussianField.setCaretColor(GameProperties.MyColor.SECOND_COLOR);
            inputRussianField.setBorder(BorderFactory.createEmptyBorder());
            inputRussianField.setFont(new Font("Times New Roman",Font.PLAIN,30));


            JTextField inputEnglishField = new JTextField();
            inputEnglishField.setSize(200,50);
            inputEnglishField.setLocation(100,10);
            inputEnglishField.setBackground(GameProperties.MyColor.BASIC_COLOR);
            inputEnglishField.setForeground(GameProperties.MyColor.SECOND_COLOR);
            inputEnglishField.setCaretColor(GameProperties.MyColor.SECOND_COLOR);
            inputEnglishField.setBorder(BorderFactory.createEmptyBorder());
            inputEnglishField.setFont(new Font("Times New Roman",Font.PLAIN,30));


            JButton addButton = new JButton("+");
            addButton.setFont(new Font("Times New Roman",Font.BOLD,50));
            addButton.setBackground(GameProperties.MyColor.BASIC_COLOR);
            addButton.setForeground(GameProperties.MyColor.SECOND_COLOR);
            addButton.setSize(65,110);
            addButton.setLocation(310,10);
            addButton.setFocusable(false);
            addButton.setBorderPainted(false);
            addButton.addActionListener(new AddNewWordActionListener(inputEnglishField,inputRussianField,this));

            this.add(inputRussianField);
        this.add(inputEnglishField);
        this.add(addButton);
        this.add(rusLabel);
        this.add(engLabel);

        this.setVisible(true);



    }
}
