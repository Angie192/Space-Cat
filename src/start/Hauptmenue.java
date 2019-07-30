package start;

public class Hauptmenue extends Var{

    public Hauptmenue() {

        if (inHauptmeü) {

            btStart.requestFocus();
            btBenden.requestFocus();
            btLaden.requestFocus();
            btStart.setVisible(true);

        } else jfl.requestFocus();


    }

}
