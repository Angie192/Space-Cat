package start;

import java.util.Timer;
import java.util.TimerTask;



public class MoneySammeln extends AbstractTimeHandler implements handel{

   public MoneySammeln() {

       timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {


            }

        }, 0, 10);

    }
}
