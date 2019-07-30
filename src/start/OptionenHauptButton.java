package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class OptionenHauptButton {

    public OptionenHauptButton() {

        // optionenHaupt positin noch nicht angepast
        btOptionenHaupt = new JButton();
        btOptionenHaupt.setText("Optionen");
        btOptionenHaupt.setBounds(300, 540, 140, 40);
        btOptionenHaupt.setVisible(false);
        btOptionenHaupt.addActionListener(new ActionHandler());
        btOptionenHaupt.setBackground(Color.gray);
        btOptionenHaupt.setFont(new Font("Arial", Font.PLAIN, 35));
        btOptionenHaupt.setForeground(Color.ORANGE);
        btOptionenHaupt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                btOptionenHaupt.setBounds(300, 540, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                btOptionenHaupt.setBounds(300, 540, 140, 40);

            }

        });
        jfl.add(btOptionenHaupt);


    }

}
