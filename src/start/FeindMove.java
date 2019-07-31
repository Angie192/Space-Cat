package start;


import java.util.Timer;
import java.util.TimerTask;




public class FeindMove extends AbstractTimeHandler{

    private int temp = 0;


        public FeindMove() {

                for (int i = 0; i <= 3; i++) {
                    feindx[i] = 80 + temp;
                    feindy[i] = -1000 + temp;

                    temp += 200;

                }

                timer.scheduleAtFixedRate(new TimerTask() {

                    @Override
                    public void run() {

                    }
            }, 0, 30);
        }

}
