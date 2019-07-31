package start;

import java.util.Timer;
import java.util.TimerTask;


public class Aktualisierung extends AbstractTimeHandler{



     int tempAktualisirung = 0;

    public Aktualisierung() {

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                void handel() {

                    if (inPause) {

                        if (tempAktualisirung == 0) {

                            btFortsetzen.requestFocus();
                            btNeuStard.requestFocus();
                            btOptionen.requestFocus();
                            btHauptmeü.requestFocus();
                            tempAktualisirung++;

                        } else if (tempAktualisirung == 1) {

                            fenster.requestFocus();

                        }
                    }

                }
            }
        }, 0, 50);
    }

}
