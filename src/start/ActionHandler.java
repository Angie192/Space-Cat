package start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Var.btFortsetzen) {

            Var.ingame = true;
            Var.inPause = false;
            Var.inLaden = false;
            Var.inOptionen = false;
            Var.inHauptmeü = false;
            Var.btHauptmeü.setVisible(false);
            Var.btOptionen.setVisible(false);
            Var.btNeuStard.setVisible(false);
            Var.btFortsetzen.setVisible(false);
            Var.btBenden.setVisible(false);
            Var.btLaden.setVisible(false);
            Var.btStart.setVisible(false);
            Var.btShtum.setVisible(false);
            Var.btOptionenHaupt.setVisible(false);

            Aktualisierung.tempAktualisirung = 0;
            Key.tempKeyhandler = 0;

            Var.jfl.requestFocus();

        } else if (e.getSource() == Var.btNeuStard) {

            Var.ingame = true;
            Var.neustard = true;
            Var.inPause = false;
            Var.inLaden = false;
            Var.inOptionen = false;
            Var.inHauptmeü = false;
            Var.btHauptmeü.setVisible(false);
            Var.btOptionen.setVisible(false);
            Var.btNeuStard.setVisible(false);
            Var.btFortsetzen.setVisible(false);
            Var.btBenden.setVisible(false);
            Var.btLaden.setVisible(false);
            Var.btStart.setVisible(false);
            Var.btShtum.setVisible(false);
            Var.btOptionenHaupt.setVisible(false);

            Aktualisierung.tempAktualisirung = 0;
            Key.tempKeyhandler = 0;

            Var.jfl.requestFocus();

        } else if (e.getSource() == Var.btOptionen) {

            Var.inPause = false;
            Var.inLaden = false;
            Var.inOptionen = true;
            Var.inHauptmeü = false;
            Var.ingame = false;
            Var.btBenden.setVisible(false);
            Var.btLaden.setVisible(false);
            Var.btStart.setVisible(false);
            Var.btNeuStard.setVisible(false);
            Var.btFortsetzen.setVisible(false);
            Var.btHauptmeü.setVisible(false);
            Var.btOptionen.setVisible(false);
            Var.btShtum.setVisible(false);
            Var.btOptionenHaupt.setVisible(false);
// TODO simpler
        } else if (e.getSource() == Var.btHauptmeü || Var.inHauptmeü == true) {

            Var.inLaden = false;
            Var.inOptionen = false;
            Var.inHauptmeü = true;
            Var.ingame = false;
            Var.inPause = false;
            Var.btBenden.setVisible(true);
            Var.btLaden.setVisible(true);
            Var.btStart.setVisible(true);
            Var.btNeuStard.setVisible(false);
            Var.btFortsetzen.setVisible(false);
            Var.btHauptmeü.setVisible(false);
            Var.btOptionen.setVisible(true);
            Var.btShtum.setVisible(false);
            Var.btOptionenHaupt.setVisible(true);

            if (e.getSource() == Var.btStart) {

                Var.ingame = true;
                Var.inPause = false;
                Var.inLaden = false;
                Var.inOptionen = false;
                Var.inHauptmeü = false;
                Var.btHauptmeü.setVisible(false);
                Var.btOptionen.setVisible(false);
                Var.btNeuStard.setVisible(false);
                Var.btFortsetzen.setVisible(false);
                Var.btBenden.setVisible(false);
                Var.btLaden.setVisible(false);
                Var.btStart.setVisible(false);
                Var.btShtum.setVisible(false);
                Var.btOptionenHaupt.setVisible(false);

                Aktualisierung.tempAktualisirung = 0;
                Key.tempKeyhandler = 0;

                Var.jfl.requestFocus();

            } else if (e.getSource() == Var.btOptionenHaupt) {

                Var.ingame = false;
                Var.inPause = false;
                Var.inLaden = false;
                Var.inOptionen = true;
                Var.inHauptmeü = false;
                Var.btHauptmeü.setVisible(true);
                Var.btOptionen.setVisible(false);
                Var.btNeuStard.setVisible(false);
                Var.btFortsetzen.setVisible(false);
                Var.btBenden.setVisible(false);
                Var.btLaden.setVisible(false);
                Var.btStart.setVisible(false);
                Var.btShtum.setVisible(true);
                Var.btOptionenHaupt.setVisible(false);

                // TODO weg
                if (e.getSource() == Var.btShtum) {

                }
// TODO weg
            } else if (e.getSource() == Var.btLaden) {

            } else if (e.getSource() == Var.btBenden) {
                System.exit(0);

            }


        }
    }
}
