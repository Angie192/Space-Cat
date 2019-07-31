package start;

import java.util.Timer;
import java.util.TimerTask;




public class Verloren  extends AbstractTimeHandler implements handel{


    private int temp = 0, temp1 = 0, temp2 = 0;

          public Verloren() {



                timer.scheduleAtFixedRate(new TimerTask() {

                    @Override
                    public void run() {



                    }
                }, 0, 15);
    }

}


