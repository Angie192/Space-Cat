package start.time;

import start.Config;

import java.util.Timer;
import java.util.TimerTask;

public abstract class AbstractTimeHandler {

    protected Timer timer;
    protected Config config;

    AbstractTimeHandler(int delary, int period) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                handle();
            }

        }, delary, period);
    }

    protected abstract void handle();

}
   // die config aus Gui bei allen TimeHandler mittels Konstruktor übergeben und in AbstractTimeHandler als Attribute speichern