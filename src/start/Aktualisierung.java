package start;

import java.util.Timer;
import java.util.TimerTask;

// FIXME nicht von Var erben
public class Aktualisierung extends Var{

    Timer Aktualisirung;


     int tempAktualisirung = 0;

    public Aktualisierung() {

        Aktualisirung = new Timer();

        Aktualisirung.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (inPause) {

                    if (tempAktualisirung == 0) {

                        btFortsetzen.requestFocus();
                        btNeuStard.requestFocus();
                        btOptionen.requestFocus();
                        btHauptmeü.requestFocus();
                        tempAktualisirung++;

                    } else if (tempAktualisirung == 1) {

                       jfl.requestFocus();

                    }
                }

            }
        }, 0, 50);
    }


}
