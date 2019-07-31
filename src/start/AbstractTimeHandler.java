package start;

import java.util.Timer;

public  abstract class AbstractTimeHandler {

       protected Timer timer;

    protected abstract handle(int dealry, int period) {


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




        if (ingame) {

            for (int i = 0; i <= 6; i++) {

                if (x >= monyX[i] - 75 && x <= monyX[i] + 75 && y >= monyY[i] - 50 && y <= monyY[i] + 50) {

                    Dosen += 1;
                    monyY[i] = -1590;

                }
            }
        }




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



        if (ingame ) {

            for (int i = 0; i <= 3; i++) {

                feindy[0] += feindspeed[0];

                if (feindy[0] >= screenhight) {
                    feindy[0] = -1000;
                }
                feindy[1] += feindspeed[1];
                if (feindy[1] >= screenhight) {
                    feindy[1] = -1000;
                }
                feindy[2] += feindspeed[2];
                if (feindy[2] >= screenhight) {
                    feindy[2] = -1000;
                }
                feindy[3] += feindspeed[3];
                if (feindy[3] >= screenhight) {
                    feindy[3] = -1000;
                }
            }
        }


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




    }









