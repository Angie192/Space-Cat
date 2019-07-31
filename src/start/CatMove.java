package start;

import java.util.Timer;
import java.util.TimerTask;


public class CatMove extends AbstractTimeHandler implements handel {


        public CatMove() {


            timer.scheduleAtFixedRate(new TimerTask() {

                public void run() {


                }

            }, 0, 10);

        }


}
