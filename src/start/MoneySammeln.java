package start;

import java.util.Timer;
import java.util.TimerTask;



public class MoneySammeln extends AbstractTimeHandler implements handel{

   public MoneySammeln() {

       timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {

                void handel() {

                    if (ingame) {

                        for (int i = 0; i <= 6; i++) {

                            if (x >= monyX[i] - 75 && x <= monyX[i] + 75 && y >= monyY[i] - 50 && y <= monyY[i] + 50) {

                                Dosen += 1;
                                monyY[i] = -1590;

                            }
                        }
                    }
                }

            }

            }, 0, 10);

    }
}
