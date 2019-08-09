package start.action;

import start.EnumButton;
import start.Gui;
import start.Key;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionHandler implements ActionListener {


    private final Gui gui;
    private final EnumButton enumButton;

    public ActionHandler(final Gui gui, final EnumButton enumButton) {
        this.gui = gui;
        this.enumButton = enumButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        this.gui.updateUi( EnumButton enumButton);





    }
}
