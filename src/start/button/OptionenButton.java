package start.button;

import start.EnumButton;
import start.Gui;
import start.action.ActionHandler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class OptionenButton extends AbstractButton {

    public OptionenButton(final Gui gui, EnumButton enumButton) {

        super();

        //Optione

        setText("Optionen");
        setBounds(300, 460, 140, 40);
        addActionListener(new ActionHandler(gui, enumButton));
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
