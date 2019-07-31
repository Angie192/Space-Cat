package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class OptionenButton {

    public OptionenButton() {


        //Optione
        btOptionen = new JButton();
        btOptionen.setText("Optionen");
        btOptionen.setBounds(300, 460, 140, 40);
        btOptionen.setVisible(false);
        btOptionen.addActionListener(new ActionHandler());
        btOptionen.setBackground(Color.gray);
        btOptionen.setFont(new Font("Arial", Font.PLAIN, 35));
        btOptionen.setForeground(Color.ORANGE);
        btOptionen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                btOptionen.setBounds(300, 460, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                btOptionen.setBounds(300, 460, 140, 40);

            }


        });
        jfl.add(btOptionen);


    }


}
