package start.button;

import start.ActionHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class OptionenButton extends AbstractButton {

    public OptionenButton() {

        super();

        //Optione

        setText("Optionen");
        setBounds(300, 460, 140, 40);
        addActionListener(new ActionHandler());
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                setBounds(300, 460, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                setBounds(300, 460, 140, 40);

            }


        });


    }


}
