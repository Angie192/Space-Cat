package Start;

import java.util.Timer;
import java.util.TimerTask;

public class back {
     Timer background;

public back(){
    background = new Timer();
    background.scheduleAtFixedRate(new TimerTask() {

        @Override
        public void run() {

            if (Var.ingame == true) {

                if (Var.backgroundY1 < 3995) {
                    Var.backgroundY1 += 2;
                } else {
                    Var.backgroundY1 = -3995;
                }
                if (Var.backgroundY2 < 3995) {
                    Var.backgroundY2 += 2;
                } else {
                    Var.backgroundY2 = -3995;
                }
            }
        }
    },0, Var.backgroundspeed);
}
}
