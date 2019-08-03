package start.button;

import start.EnumButton;
import start.Gui;
import start.action.ActionHandler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class FortsetzenButton extends AbstractButton {


    public FortsetzenButton(final Gui gui, final EnumButton enumButton) {

        super();

        //Fortsetzen

        setText("Fortsetzen");
        setBounds(300, 300, 140, 40);
        addActionListener(new ActionHandler(gui, enumButton));
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

