package start.button;

import start.ActionHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class FortsetzenButton extends AbstractButton {


    public FortsetzenButton() {

        super();

        //Fortsetzen

        setText("Fortsetzen");
        setBounds(300, 300, 140, 40);
        addActionListener(new ActionHandler());
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                setBounds(300, 300, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                setBounds(300, 300, 140, 40);

            }


        });


    }


}

