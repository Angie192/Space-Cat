package start;

public class Aktualisierung extends AbstractTimeHandler {

    private int tempAktualisirung = 0;

    public Aktualisierung() {
      super(0, 50);
    }
     
    protected abstract void handle() {
     if (inPause) {
              if (tempAktualisirung == 0) {

                  btFortsetzen.requestFocus();
                  btNeuStard.requestFocus();
                  btOptionen.requestFocus();
                  btHauptmeü.requestFocus();
                  tempAktualisirung++;

              } else if (tempAktualisirung == 1) {

                  fenster.requestFocus();

              }

      }
    }

}
