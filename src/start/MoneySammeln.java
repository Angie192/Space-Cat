package start;

import java.util.Timer;
import java.util.TimerTask;

public class MoneySammeln extends Var{

    // TODO privat, da die Klasse MoneySammeln die Datenhoheit besitzt.
   private Timer Msameln;

    public MoneySammeln() {

        Msameln = new Timer();

        Msameln.scheduleAtFixedRate(new TimerTask() {

            public void run() {

                // TODO simpler machen
                if (ingame == true) {

                    for (int i = 0; i <= 6; i++) {

                        if (x >= monyX[i] - 75 && x <= monyX[i] + 75 && y >= monyY[i] - 50 && y <= monyY[i] + 50) {

                            Dosen += 1;
                            monyY[i] = -1590;

                        }
                    }
                }

            }


        }, 0, 10);

    }

}
