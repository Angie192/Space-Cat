package start;

import java.util.Timer;
import java.util.TimerTask;

public class Verloren {
    Timer lose;

    private int temp = 0, temp1 = 0, temp2 = 0;


    public Verloren() {

        lose = new Timer();


        lose.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Var.lose == true) {

                    if (temp >= 0 && temp <= 55) {
                        temp++;

                    } else if (temp == 56) {

                        System.out.println("Verloren");

                        //Mony
                        for (int i = 0; i <= 6; i++) {
                            Var.monyY[i] = 0;
                        }

                        for (int u = 0; u <= 6; u++) {
                            Var.monyX[u] = 40 + temp1;
                            Var.monyY[u] = -606 + temp1;

                            temp1 += 100;

                        }

                        Var.monyspeed[0] = 3;
                        Var.monyspeed[1] = 2;
                        Var.monyspeed[2] = 1;
                        Var.monyspeed[3] = 2;
                        Var.monyspeed[4] = 4;
                        Var.monyspeed[5] = 1;
                        Var.monyspeed[6] = 2;

                        // Gegner
                        for (int i = 0; i <= 3; i++) {
                            Var.feindy[i] = 0;
                        }

                        for (int i = 0; i <= 3; i++) {
                            Var.feindx[i] = 80 + temp2;
                            Var.feindy[i] = -1000 + temp2;

                            temp2 += 200;
                        }

                        Var.feindspeed[0] = 1;
                        Var.feindspeed[1] = 3;
                        Var.feindspeed[2] = 4;
                        Var.feindspeed[3] = 2;

                        temp = 0;
                        temp1 = 0;
                        temp2 = 0;

                        if (Var.Dosen > 5) {
                            Var.Dosen -= 5;
                        } else {
                            Var.Dosen = 0;
                        }

                        Var.Leben = 3;
                        Var.inPause = true;
                    }
                }
            }
        }, 0, 15);


    }


}


