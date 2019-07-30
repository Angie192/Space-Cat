package start;

import java.util.Timer;
import java.util.TimerTask;

public class CatMove extends Var {
    Timer catmove;


    public CatMove() {
        catmove = new Timer();
        catmove.scheduleAtFixedRate(new TimerTask() {

            public void run() {

                // TODO simpler
                if (ingame == true) {

                    // TODO simpler
                    if (moveright == true) {
                        if (x < 610) {
                            x += movespeed;

                        }
                        // TODO simpler
                    } else if (moveleft == true) {
                        if (x > 0) {
                            x -= movespeed;

                        }
                    }

                    // TODO simpler
                    if (jump == true) {
                        if (y > 0) {
                            y -= jumpspeed;
                            //System.out.println(Var.y);
                        }

                    // TODO simpler
                    } else if (down == true) {
                        if (y < 839) {
                            y += jumpspeed;
                        }
                    }


                }
            }

        }, 0, 10);

    }

}
