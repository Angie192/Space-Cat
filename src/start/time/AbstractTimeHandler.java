package start.time;

import start.Config;

import java.util.Timer;
import java.util.TimerTask;

public abstract class AbstractTimeHandler {

    protected Timer timer;

    AbstractTimeHandler(int delary, int period, Config config) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                handle();
            }

        }, delary, period);
        config = new Config();
    }

    protected abstract void handle();

}
