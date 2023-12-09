import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setSize(800,600);//game properties
                this.setResizable(false);
                this.setLocationRelativeTo(null);
                this.getContentPane().setBackground(Color.orange);//Properties
            Label cardLabel = new JLabel();


                this.setVisible(true);
    }
}
