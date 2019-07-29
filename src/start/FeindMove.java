package start;


import java.util.Timer;
import java.util.TimerTask;

public class FeindMove {
    Timer gmove;
    private int temp = 0;


    public FeindMove() {

        for (int i = 0; i <= 3; i++) {
            Var.feindx[i] = 80 + temp;
            Var.feindy[i] = -1000 + temp;

            temp += 200;

        }
        gmove = new Timer();
        gmove.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Var.ingame == true) {

                    for (int i = 0; i <= 3; i++) {

                        Var.feindy[0] += Var.feindspeed[0];

                        if (Var.feindy[0] >= Var.screenhight) {
                            Var.feindy[0] = -1000;
                        }
                        Var.feindy[1] += Var.feindspeed[1];
                        if (Var.feindy[1] >= Var.screenhight) {
                            Var.feindy[1] = -1000;
                        }
                        Var.feindy[2] += Var.feindspeed[2];
                        if (Var.feindy[2] >= Var.screenhight) {
                            Var.feindy[2] = -1000;
                        }
                        Var.feindy[3] += Var.feindspeed[3];
                        if (Var.feindy[3] >= Var.screenhight) {
                            Var.feindy[3] = -1000;
                        }
                    }
                }
            }
        }, 0, 30);
    }

}
