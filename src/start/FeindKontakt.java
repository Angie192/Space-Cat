package start;

import java.util.Timer;
import java.util.TimerTask;


public class FeindKontakt extends AbstractTimeHandler implements handel {


    private int temp = 0, temp1 = 0;

      public FeindKontakt() {


                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {

                    }

        }, 0, 15);

    }

}


