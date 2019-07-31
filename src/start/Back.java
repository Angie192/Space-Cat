package start;

import java.util.Timer;
import java.util.TimerTask;


public class Back extends AbstractTimeHandler {


    public Back() {

        background = new Timer();
        background.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (ingame) {

                    if (backgroundY1 < 3995) {
                        backgroundY1 += 2;
                    } else {
                        backgroundY1 = -3995;
                    }
                    if (backgroundY2 < 3995) {
                        backgroundY2 += 2;
                    } else {
                        backgroundY2 = -3995;
                    }
                }
            }
        }, 0, backgroundspeed);
    }
}
