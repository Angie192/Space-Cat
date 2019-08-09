package start.button;

import start.EnumButton;
import start.Gui;
import start.action.ActionHandler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class HaupmeüButton extends AbstractButton {


    public HaupmeüButton(final Gui gui, final EnumButton enumButton) {

        super();

        //Hauptmeü

        setText("Hauptmeü");
        setBounds(300, 540, 140, 40);
        addActionListener(new ActionHandler(gui, enumButton));
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
