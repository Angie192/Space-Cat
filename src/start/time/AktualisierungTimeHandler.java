package start.time;


public static class AktualisierungTimeHandler extends AbstractTimeHandler {

    private int tempAktualisirung = 0;

    public AktualisierungTimeHandler() {
        super(0, 15);
    }

    protected void handle() {
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
