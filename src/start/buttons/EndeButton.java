package start.buttons;

import start.ActionHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class EndeButton {

    public EndeButton() {

        // Beenden positin noch nicht angepast
        btBenden = new JButton();
        btBenden.setText("Beenden");
        btBenden.setBounds(300, 540, 140, 40);
        btBenden.setVisible(false);
        btBenden.addActionListener(new ActionHandler());
        btBenden.setBackground(Color.gray);
        btBenden.setFont(new Font("Arial", Font.PLAIN, 35));
        btBenden.setForeground(Color.ORANGE);
        btBenden.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                btBenden.setBounds(300, 540, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                btBenden.setBounds(300, 540, 140, 40);

            }


        });
        jfl.add(btBenden);

    }

}
