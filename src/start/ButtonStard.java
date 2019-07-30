package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonStard extends Var {

public ButtonStard() {

    // Stard positin noch nicht angepast
    btStart = new JButton();
    btStart.setText("Stard");
    btStart.setBounds(300, 540, 140, 40);
    btStart.setVisible(false);
    btStart.addActionListener(new ActionHandler());
    btStart.setBackground(Color.gray);
    btStart.setFont(new Font("Arial", Font.PLAIN, 35));
    btStart.setForeground(Color.ORANGE);
    btStart.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {

            btStart.setBounds(300, 540, 150, 50);

        }

        public void mouseExited(MouseEvent e) {

            btStart.setBounds(300, 540, 140, 40);

        }


    });
    jfl.add(btStart);


    }


}
