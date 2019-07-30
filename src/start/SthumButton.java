package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class SthumButton {

    public SthumButton() {

        // stum positin noch nicht angepast
        btShtum = new JButton();
        btShtum.setText("Optionen");
        btShtum.setBounds(300, 540, 140, 40);
        btShtum.setVisible(false);
        btShtum.addActionListener(new ActionHandler());
        btShtum.setBackground(Color.gray);
        btShtum.setFont(new Font("Arial", Font.PLAIN, 35));
        btShtum.setForeground(Color.ORANGE);
        btShtum.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {

                btShtum.setBounds(300, 540, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                btShtum.setBounds(300, 540, 140, 40);

            }

        });
        jfl.add(btShtum);
    }

}
