package start.time;

public class FeindKontakt extends AbstractTimeHandler {


    private int temp = 0, temp1 = 0;

    public FeindKontakt() {
        super(0, 15);
    }


    protected void handle() {


        if (ingame) {

            for (int i = 0; i <= 3; i++) {

                if (temp == 0) {

                    if (x >= feindx[0] - 110 && x <= feindx[0] + 110 && y >= feindy[0] - 113 && y <= feindy[0] + 113) {

                        kontakt = true;
                        feindy[0] = -1000;

                        if (Leben >= 1) {
                            Leben -= 1;
                        }

                    }

                    if (x >= feindx[1] - 110 && x <= feindx[1] + 110 && y >= feindy[1] - 113 && y <= feindy[1] + 113) {

                        kontakt1 = true;

                        if (temp1 == 0) {
                            feindy[1] = -1000;
                        }

                        if (Leben >= 1) {
                            Leben -= 1;
                        }

                    }

                    if (x >= feindx[2] - 110 && x <= feindx[2] + 110 && y >= feindy[2] - 113 && y <= feindy[2] + 113) {

                        kontakt2 = true;


                        feindy[2] = -1000;


                        if (Leben >= 1) {
                            Leben -= 1;
                        }

                    }

                    if (x >= feindx[3] - 110 && x <= feindx[3] + 110 && y >= feindy[3] - 113 && y <= feindy[3] + 113) {

                        kontakt3 = true;
                        feindy[3] = -1000;

                        if (Leben >= 1) {
                            Leben -= 1;
                        }

                    }

                    if (Leben == 0) {
                        lose = true;

                    } else if (Leben > 0) {

                        lose = false;
                    }

                    temp++;
                }
            }

            if (temp >= 0 && temp <= 55) {
                temp++;
            } else if (temp == 56) {
                temp = 0;

                kontakt = false;
                kontakt1 = false;
                kontakt2 = false;
                kontakt3 = false;
            }
        }
    }

}





