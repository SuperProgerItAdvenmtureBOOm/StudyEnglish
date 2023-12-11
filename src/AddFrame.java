import javax.swing.*;
import java.awt.*;

public class AddFrame extends JFrame {
    public AddFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(GameProperties.MyColor.SECOND_COLOR);//Properties
        this.setSize(400,170);



            JTextField inputRussianField = new JTextField();
            inputRussianField.setSize(200,50);
            inputRussianField.setLocation(110,10);
            inputRussianField.setBackground(GameProperties.MyColor.BASIC_COLOR);
            inputRussianField.setForeground(GameProperties.MyColor.SECOND_COLOR);
            inputRussianField.setCaretColor(GameProperties.MyColor.SECOND_COLOR);
            inputRussianField.setBorder(BorderFactory.createEmptyBorder());
            inputRussianField.setFont(new Font("Times New Roman",Font.PLAIN,30));

            JTextField inputEnglishField = new JTextField();
            inputEnglishField.setSize(200,50);
            inputEnglishField.setLocation(110,70);
            inputEnglishField.setBackground(GameProperties.MyColor.BASIC_COLOR);
            inputEnglishField.setForeground(GameProperties.MyColor.SECOND_COLOR);
            inputEnglishField.setCaretColor(GameProperties.MyColor.SECOND_COLOR);
            inputEnglishField.setBorder(BorderFactory.createEmptyBorder());
            inputEnglishField.setFont(new Font("Times New Roman",Font.PLAIN,30));

            this.add(inputRussianField);
        this.add(inputEnglishField);

        this.setVisible(true);



    }
}
