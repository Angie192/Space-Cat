package start;

import java.util.Timer;
import java.util.TimerTask;


public class Back extends Back.AbstractTimeHandler {


    public Back() {
        super(0, 100);
    }


    protected void handle() {

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

    public abstract static class AbstractTimeHandler {

        protected Timer timer;

        AbstractTimeHandler(int delary, int period) {
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {

                @Override
                public void run() {
    <<<<<<<HEAD

                    handle();
    =======
                    handle();
    >>>>>>>f955a19e36bf20294c7282bb8d9c8154ee3aabae
                }

            }, delary, period);
        }

        protected abstract void handle();

    }
}
