package start;


import java.util.Timer;
import java.util.TimerTask;

// FIXME Datei ordentlich formatieren

// FIXME nicht von Var erben
public class FeindMove extends Var {
    Timer gmove;
    private int temp = 0;


    public FeindMove() {

        for (int i = 0; i <= 3; i++) {
            feindx[i] = 80 + temp;
            feindy[i] = -1000 + temp;

            temp += 200;

        }
        gmove = new Timer();
        gmove.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (ingame ) {

                    for (int i = 0; i <= 3; i++) {

                        feindy[0] += feindspeed[0];

                        if (feindy[0] >= screenhight) {
                            feindy[0] = -1000;
                        }
                        feindy[1] += feindspeed[1];
                        if (feindy[1] >= screenhight) {
                            feindy[1] = -1000;
                        }
                        feindy[2] += feindspeed[2];
                        if (feindy[2] >= screenhight) {
                            feindy[2] = -1000;
                        }
                        feindy[3] += feindspeed[3];
                        if (feindy[3] >= screenhight) {
                            feindy[3] = -1000;
                        }
                    }
                }
            }
        }, 0, 30);
    }

}
