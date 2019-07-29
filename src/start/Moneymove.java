package start;

import java.util.Timer;
import java.util.TimerTask;

public class Moneymove {

    // TODO privat, da die Klasse Moneymove die Datenhoheit besitzt.
    Timer Monymove;
    private int temp = 0;


    public Moneymove() {

        for (int u = 0; u <= 6; u++) {
            Var.monyX[u] = 40 + temp;
            Var.monyY[u] = -660 + temp;

            temp += 100;

        }
        Monymove = new Timer();
        Monymove.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                // TODO simpler
                if (Var.ingame == true) {

                    for (int u = 0; u <= 6; u++) {

                        Var.monyY[0] += Var.monyspeed[0];

                        if (Var.monyY[0] >= Var.screenhight) {
                            Var.monyY[0] = -1000;
                        }
                        Var.monyY[1] += Var.monyspeed[1];
                        if (Var.monyY[1] >= Var.screenhight) {
                            Var.monyY[1] = -1000;
                        }
                        Var.monyY[2] += Var.monyspeed[2];
                        if (Var.monyY[2] >= Var.screenhight) {
                            Var.monyY[2] = -1000;
                        }
                        Var.monyY[3] += Var.monyspeed[3];
                        if (Var.monyY[3] >= Var.screenhight) {
                            Var.monyY[3] = -1000;
                        }
                        Var.monyY[4] += Var.monyspeed[4];
                        if (Var.monyY[4] >= Var.screenhight) {
                            Var.monyY[4] = -1000;
                        }
                        Var.monyY[5] += Var.monyspeed[5];
                        if (Var.monyY[5] >= Var.screenhight) {
                            Var.monyY[5] = -1000;
                        }
                        Var.monyY[6] += Var.monyspeed[6];
                        if (Var.monyY[6] >= Var.screenhight) {
                            Var.monyY[6] = -1000;
                        }
                    }
                }
            }
        }, 0, 200);
    }
}
