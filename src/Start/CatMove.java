package Start;

import java.util.Timer;
import java.util.TimerTask;

public class CatMove {
Timer catmove;


public CatMove(){
   catmove = new Timer();
    catmove.scheduleAtFixedRate(new TimerTask() {

        public void run () {

            if (Var.ingame == true) {

                if (Var.moveright == true) {
                    if (Var.x < 610) {
                        Var.x += Var.movespeed;

                    }
                } else if (Var.moveleft == true) {
                    if (Var.x > 0) {
                        Var.x -= Var.movespeed;

                    }
                }


                if (Var.jump == true) {
                    if (Var.y > 0) {
                        Var.y -= Var.jumpspeed;
                        //System.out.println(Var.y);
                    }

                } else if (Var.down == true) {
                    if (Var.y < 839) {
                        Var.y += Var.jumpspeed;
                    }
                }


            }
        }

    },0, 10);

}

}
