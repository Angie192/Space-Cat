package start;


class Moneymove extends Back.AbstractTimeHandler {

    private int temp = 0;

    public Moneymove() {
        super(0, 200);
    }

            for(
    int u = 0;
    u <=6;u++)

    {
        monyX[u] = 40 + temp;
        monyY[u] = -660 + temp;

        temp += 100;

    }


    protected void handle() {

        if (ingame) {

            for (int u = 0; u <= 6; u++) {

                monyY[0] += monyspeed[0];

                if (monyY[0] >= screenhight) {
                    monyY[0] = -1000;
                }
                monyY[1] += monyspeed[1];
                if (monyY[1] >= screenhight) {
                    monyY[1] = -1000;
                }
                monyY[2] += monyspeed[2];
                if (monyY[2] >= screenhight) {
                    monyY[2] = -1000;
                }
                monyY[3] += monyspeed[3];
                if (monyY[3] >= screenhight) {
                    monyY[3] = -1000;
                }
                monyY[4] += monyspeed[4];
                if (monyY[4] >= screenhight) {
                    monyY[4] = -1000;
                }
                monyY[5] += monyspeed[5];
                if (monyY[5] >= screenhight) {
                    monyY[5] = -1000;
                }
                monyY[6] += monyspeed[6];
                if (monyY[6] >= screenhight) {
                    monyY[6] = -1000;
                }
            }
        }

    }
}





