package start.time;


public class BackTimeHandler extends AbstractTimeHandler {


    public BackTimeHandler() {
        super(0, 100);
    }


    protected void handle() {

        if (ingame) {

            if (backgroundY1 < 3995) {
                backgroundY1 += 2;
            } else {
                backgroundY1 = -3995;
            }
            if (backgroundY2 < 3995) {
                backgroundY2 += 2;
            } else {
                backgroundY2 = -3995;
            }
        }
    }
}
