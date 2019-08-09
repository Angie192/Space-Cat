package start.button;

import start.EnumButton;
import start.Gui;
import start.action.ActionHandler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class EndeButton extends AbstractButton {

    public EndeButton(final Gui gui, final EnumButton enumButton) {

        super();

        // Beenden positin noch nicht angepast

        setText("Beenden");
        setBounds(300, 540, 140, 40);
        addActionListener(new ActionHandler(gui,enumButton));
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
