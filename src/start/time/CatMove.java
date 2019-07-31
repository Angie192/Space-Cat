package start.time;

public class CatMove extends AbstractTimeHandler {


    public CatMove() {
        super(0, 10);
    }


    protected void handle() {

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
}

