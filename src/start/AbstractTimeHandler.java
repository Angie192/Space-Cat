package start;

import java.util.Timer;
import java.util.TimerTask;

public abstract class AbstractTimeHandler {

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
