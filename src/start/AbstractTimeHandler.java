package start;

import java.util.Timer;
import java.util.TimerTask;

public  abstract class AbstractTimeHandler {

    protected Timer timer;

    AbstractTimeHandler(int delary, int period){
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
