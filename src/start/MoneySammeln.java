package start;


public class MoneySammeln extends Back.AbstractTimeHandler {

    public MoneySammeln() {
        super(0, 10);
    }

    protected void handle() {

        if (ingame) {

            for (int i = 0; i <= 6; i++) {

                if (x >= monyX[i] - 75 && x <= monyX[i] + 75 && y >= monyY[i] - 50 && y <= monyY[i] + 50) {

                    Dosen += 1;
                    monyY[i] = -1590;

                }
            }
        }
    }

}



