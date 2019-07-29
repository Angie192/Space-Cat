package Start;

import java.util.Timer;
import java.util.TimerTask;

public class MonySammeln {

    Timer Msameln;

public MonySammeln(){

    Msameln = new Timer();

    Msameln.scheduleAtFixedRate(new TimerTask() {

      public void run() {

          if (Var.ingame == true) {

              for (int i = 0; i <= 6; i++) {

                  if (Var.x >= Var.monyX[i] - 75 && Var.x <= Var.monyX[i] + 75 && Var.y >= Var.monyY[i] - 50 && Var.y <= Var.monyY[i] + 50) {

                      Var.Dosen += 1;
                      Var.monyY[i] = -1590;

                  }
              }
          }

    }


  }, 0, 10);

}

}
