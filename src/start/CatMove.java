package start;

import java.util.Timer;
import java.util.TimerTask;

// FIXME Datei ordentlich formatieren

// FIXME nicht von Var erben
public class CatMove extends Var {
    Timer catmove;


    public CatMove() {
        catmove = new Timer();
        catmove.scheduleAtFixedRate(new TimerTask() {

            public void run() {


                if (ingame) {


                    if (moveright) {
                        if (x < 610) {
                            x += movespeed;

                        }

                    } else if (moveleft) {
                        if (x > 0) {
                            x -= movespeed;

                        }
                    }


                    if (jump) {
                        if (y > 0) {
                            y -= jumpspeed;
                            //System.out.println(Var.y);
                        }


                    } else if (down) {
                        if (y < 839) {
                            y += jumpspeed;
                        }
                    }


                }
            }

        }, 0, 10);

    }

}
