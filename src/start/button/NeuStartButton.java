package start.button;

import start.EnumButton;
import start.Gui;
import start.action.ActionHandler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class NeuStartButton extends AbstractButton {


    public NeuStartButton(final Gui gui, final EnumButton enumButton) {

        super();

        //Neu Stard

        setText("Neu Stard");
        setBounds(300, 380, 140, 40);
        addActionListener(new ActionHandler(gui, enumButton));
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
