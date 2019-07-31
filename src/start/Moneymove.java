package start;

import java.util.Timer;
import java.util.TimerTask;




class Moneymove extends AbstractTimeHandler implements handel{

    private int temp = 0;

        public Moneymove() {

            for (int u = 0; u <= 6; u++) {
                monyX[u] = 40 + temp;
                monyY[u] = -660 + temp;

                temp += 100;

            }

                timer.scheduleAtFixedRate(new TimerTask() {

                    @Override
                    public void run() {


                    }
            }, 0, 200);

        }
}
