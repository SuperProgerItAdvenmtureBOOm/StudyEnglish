package ActionListeners;

import Frames.AddFrame;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyAddButtonListener implements MouseListener {
    private JButton addButton;
    private ImageIcon[] pluses;
    public MyAddButtonListener(JButton addButton, ImageIcon[] pluses){
        this.addButton = addButton;
        this.pluses = pluses;
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                addButton.setIcon(pluses[1]);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                addButton.setIcon(pluses[2]);

            }
        }).start();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if(addButton.getIcon() == pluses[2]) {
                    addButton.setIcon(pluses[1]);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                    addButton.setIcon(pluses[0]);
                }

            }
        }).start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        addButton.setIcon(pluses[3]);
        AddFrame secondFrame = new AddFrame();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        addButton.setIcon(pluses[2]);
    }


}
