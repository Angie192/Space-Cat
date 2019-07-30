package start;

public class Hauptmenue extends Var{

    public Hauptmenue() {
        // TODO simpler
        if (inHauptmeü == true) {

            btStart.requestFocus();
            btBenden.requestFocus();
            btLaden.requestFocus();
            btStart.setVisible(true);

        } else jfl.requestFocus();


    }

}
