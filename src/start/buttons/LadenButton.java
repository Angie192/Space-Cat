package start.buttons;

import start.ActionHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class LadenButton {

    public LadenButton() {

        // Laden positin noch nicht angepast
        btLaden = new JButton();
        btLaden.setText("Laden");
        btLaden.setBounds(300, 540, 140, 40);
        btLaden.setVisible(false);
        btLaden.addActionListener(new ActionHandler());
        btLaden.setBackground(Color.gray);
        btLaden.setFont(new Font("Arial", Font.PLAIN, 35));
        btLaden.setForeground(Color.ORANGE);
        btLaden.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                btLaden.setBounds(300, 540, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                btLaden.setBounds(300, 540, 140, 40);

            }


        });
        jfl.add(btLaden);

    }


}
