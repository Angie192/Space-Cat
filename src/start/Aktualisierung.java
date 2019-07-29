package start;

import java.util.Timer;
import java.util.TimerTask;

public class Aktualisierung {

    Timer Aktualisirung;

    static int tempAktualisirung = 0;

    public Aktualisierung() {

        Aktualisirung = new Timer();

        Aktualisirung.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Var.inPause == true) {

                    if (tempAktualisirung == 0) {

                        Var.btFortsetzen.requestFocus();
                        Var.btNeuStard.requestFocus();
                        Var.btOptionen.requestFocus();
                        Var.btHauptmeü.requestFocus();
                        tempAktualisirung++;

                    } else if (tempAktualisirung == 1) {

                        Var.jfl.requestFocus();

                    }
                }

            }
        }, 0, 50);
    }


}
