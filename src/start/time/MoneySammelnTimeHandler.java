package start.time;

import start.Config;

public class MoneySammelnTimeHandler extends AbstractTimeHandler {

    public MoneySammelnTimeHandler(final Config config) {
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



