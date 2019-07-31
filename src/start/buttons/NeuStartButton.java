package start.buttons;

import start.ActionHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class NeuStartButton {


    public NeuStartButton() {

        //Neu Stard
        btNeuStard = new JButton();
        btNeuStard.setText("Neu Stard");
        btNeuStard.setBounds(300, 380, 140, 40);
        btNeuStard.setVisible(false);
        btNeuStard.addActionListener(new ActionHandler());
        btNeuStard.setBackground(Color.gray);
        btNeuStard.setFont(new Font("Arial", Font.PLAIN, 35));
        btNeuStard.setForeground(Color.ORANGE);
        btNeuStard.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {

                btNeuStard.setBounds(300, 380, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                btNeuStard.setBounds(300, 380, 140, 40);

            }


        });
        jfl.add(btNeuStard);

    }

}
