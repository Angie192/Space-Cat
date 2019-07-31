package start.button;

import start.ActionHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class StartButton extends AbstractButton {

    public StartButton() {

        super();

        // Stard positin noch nicht angepast

        setText("Stard");
        setBounds(300, 540, 140, 40);
        addActionListener(new ActionHandler());
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {

                setBounds(300, 540, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                setBounds(300, 540, 140, 40);

            }

        });


    }

}
