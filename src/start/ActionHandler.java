package start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler extends Aktualisierung implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btFortsetzen) {

           ingame = true;
            inPause = false;
            inLaden = false;
            inOptionen = false;
            inHauptmeü = false;
            btHauptmeü.setVisible(false);
            btOptionen.setVisible(false);
            btNeuStard.setVisible(false);
            btFortsetzen.setVisible(false);
            btBenden.setVisible(false);
            btLaden.setVisible(false);
            btStart.setVisible(false);
            btShtum.setVisible(false);
            btOptionenHaupt.setVisible(false);

            tempAktualisirung = 0;
            Key.tempKeyhandler = 0;

            jfl.requestFocus();

        } else if (e.getSource() == btNeuStard) {

            ingame = true;
            neustard = true;
            inPause = false;
            inLaden = false;
            inOptionen = false;
            inHauptmeü = false;
            btHauptmeü.setVisible(false);
            btOptionen.setVisible(false);
            btNeuStard.setVisible(false);
            btFortsetzen.setVisible(false);
            btBenden.setVisible(false);
            btLaden.setVisible(false);
            btStart.setVisible(false);
            btShtum.setVisible(false);
            btOptionenHaupt.setVisible(false);

            tempAktualisirung = 0;
            Key.tempKeyhandler = 0;

            jfl.requestFocus();

        } else if (e.getSource() == btOptionen) {

            inPause = false;
            inLaden = false;
            inOptionen = true;
            inHauptmeü = false;
            ingame = false;
            btBenden.setVisible(false);
            btLaden.setVisible(false);
            btStart.setVisible(false);
            btNeuStard.setVisible(false);
            btFortsetzen.setVisible(false);
            btHauptmeü.setVisible(false);
            btOptionen.setVisible(false);
            btShtum.setVisible(false);
            btOptionenHaupt.setVisible(false);
// TODO simpler
        } else if (e.getSource() == btHauptmeü ||inHauptmeü == true) {

            inLaden = false;
            inOptionen = false;
            inHauptmeü = true;
            ingame = false;
            inPause = false;
            btBenden.setVisible(true);
            btLaden.setVisible(true);
            btStart.setVisible(true);
            btNeuStard.setVisible(false);
            btFortsetzen.setVisible(false);
            btHauptmeü.setVisible(false);
            btOptionen.setVisible(true);
            btShtum.setVisible(false);
            btOptionenHaupt.setVisible(true);

            if (e.getSource() == btStart) {

                ingame = true;
                inPause = false;
                inLaden = false;
                inOptionen = false;
                inHauptmeü = false;
                btHauptmeü.setVisible(false);
                btOptionen.setVisible(false);
                btNeuStard.setVisible(false);
                btFortsetzen.setVisible(false);
                btBenden.setVisible(false);
                btLaden.setVisible(false);
                btStart.setVisible(false);
                btShtum.setVisible(false);
                btOptionenHaupt.setVisible(false);

                tempAktualisirung = 0;
                Key.tempKeyhandler = 0;

                jfl.requestFocus();

            } else if (e.getSource() ==btOptionenHaupt) {

                ingame = false;
                inPause = false;
                inLaden = false;
                inOptionen = true;
                inHauptmeü = false;
                btHauptmeü.setVisible(true);
                btOptionen.setVisible(false);
                btNeuStard.setVisible(false);
                btFortsetzen.setVisible(false);
                btBenden.setVisible(false);
                btLaden.setVisible(false);
                btStart.setVisible(false);
                btShtum.setVisible(true);
                btOptionenHaupt.setVisible(false);

                // TODO weg*

// TODO weg*
            } else if (e.getSource() == btBenden) {
                System.exit(0);

            }


        }
    }
}
