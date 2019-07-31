package start;


import java.util.Timer;
import java.util.TimerTask;




public class FeindMove extends AbstractTimeHandler{

    private int temp = 0;


        public FeindMove() { super(0,30);}

                for (int i = 0; i <= 3; i++) {
                    feindx[i] = 80 + temp;
                    feindy[i] = -1000 + temp;

                    temp += 200;

                }

                        protected void handle() {

                            if (ingame) {

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
                        }
                    }



