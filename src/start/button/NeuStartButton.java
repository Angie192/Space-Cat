package start.button;

import start.ActionHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class NeuStartButton extends AbstractButton {


    public NeuStartButton() {

        //Neu Stard

        setText("Neu Stard");
        setBounds(300, 380, 140, 40);
        setVisible(false);
        addActionListener(new ActionHandler());
        setBackground(Color.gray);
        setFont(new Font("Arial", Font.PLAIN, 35));
        setForeground(Color.ORANGE);
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {

                setBounds(300, 380, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                setBounds(300, 380, 140, 40);

            }


        });


    }

}
