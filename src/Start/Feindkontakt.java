package Start;

import java.util.Timer;
import java.util.TimerTask;

public class Feindkontakt {
    Timer Fkontakt;
    private int temp = 0, temp1 = 0, temp2 = 0, temp3 = 0;

    public Feindkontakt() {

        Fkontakt = new Timer();

        Fkontakt.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Var.ingame == true) {

                    for (int i = 0; i <= 3; i++) {

                        if (temp == 0) {

                            if (Var.x >= Var.feindx[0] - 110 && Var.x <= Var.feindx[0] + 110 && Var.y >= Var.feindy[0] - 113 && Var.y <= Var.feindy[0] + 113) {

                                Var.kontakt = true;
                                Var.feindy[0] = -1000;

                                if (Var.Leben >= 1) {
                                    Var.Leben -= 1;
                                }

                            }


                            if (Var.x >= Var.feindx[1] - 110 && Var.x <= Var.feindx[1] + 110 && Var.y >= Var.feindy[1] - 113 && Var.y <= Var.feindy[1] + 113) {

                                Var.kontakt1 = true;

                                if (temp1 == 0) {
                                    Var.feindy[1] = -1000;
                                }

                                if (Var.Leben >= 1) {
                                    Var.Leben -= 1;
                                }

                            }


                            if (Var.x >= Var.feindx[2] - 110 && Var.x <= Var.feindx[2] + 110 && Var.y >= Var.feindy[2] - 113 && Var.y <= Var.feindy[2] + 113) {

                                Var.kontakt2 = true;


                                Var.feindy[2] = -1000;


                                if (Var.Leben >= 1) {
                                    Var.Leben -= 1;
                                }

                            }


                            if (Var.x >= Var.feindx[3] - 110 && Var.x <= Var.feindx[3] + 110 && Var.y >= Var.feindy[3] - 113 && Var.y <= Var.feindy[3] + 113) {

                                Var.kontakt3 = true;
                                Var.feindy[3] = -1000;

                                if (Var.Leben >= 1) {
                                    Var.Leben -= 1;
                                }

                            }

                            if (Var.Leben == 0) {
                                Var.lose = true;

                            } else if (Var.Leben > 0) {

                                Var.lose = false;
                            }

                            temp++;
                        }
                    }

                    if (temp >= 0 && temp <= 55) {
                        temp++;
                    } else if (temp == 56) {
                        temp = 0;

                        Var.kontakt = false;
                        Var.kontakt1 = false;
                        Var.kontakt2 = false;
                        Var.kontakt3 = false;
                    }


                }

            }

                }, 0, 15);

    }

}


