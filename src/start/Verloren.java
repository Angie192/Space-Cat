package start;

import java.util.Timer;
import java.util.TimerTask;




public class Verloren  extends AbstractTimeHandler{


    private int temp = 0, temp1 = 0, temp2 = 0;

          public Verloren() {


                verloren = new Timer();
                verloren.scheduleAtFixedRate(new TimerTask() {

                    @Override
                    public void run() {


                        if (lose) {

                            if (temp >= 0 && temp <= 55) {
                                temp++;

                            } else if (temp == 56) {

                                System.out.println("Verloren");

                                //Mony
                                for (int i = 0; i <= 6; i++) {
                                    monyY[i] = 0;
                                }

                                for (int u = 0; u <= 6; u++) {
                                    monyX[u] = 40 + temp1;
                                    monyY[u] = -606 + temp1;

                                    temp1 += 100;

                                }

                                    monyspeed[0] = 3;
                                    monyspeed[1] = 2;
                                    monyspeed[2] = 1;
                                    monyspeed[3] = 2;
                                    monyspeed[4] = 4;
                                    monyspeed[5] = 1;
                                    monyspeed[6] = 2;

                                    // Gegner
                                    for (int i = 0; i <= 3; i++) {
                                        feindy[i] = 0;
                                    }

                                    for (int i = 0; i <= 3; i++) {
                                        feindx[i] = 80 + temp2;
                                        feindy[i] = -1000 + temp2;

                                        temp2 += 200;

                                    }

                                        feindspeed[0] = 1;
                                        feindspeed[1] = 3;
                                        feindspeed[2] = 4;
                                        feindspeed[3] = 2;

                                        temp = 0;
                                        temp1 = 0;
                                        temp2 = 0;

                                        if (Dosen > 5) {
                                            Dosen -= 5;
                                        } else {
                                            Dosen = 0;
                                        }

                                        Leben = 3;
                                        inPause = true;
                            }
                        }
                    }
                }, 0, 15);
    }

}


