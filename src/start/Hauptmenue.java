package start;

public class Hauptmenue {

    public Hauptmenue() {
        // TODO simpler
        if (Var.inHauptmeü == true) {

            Var.btStart.requestFocus();
            Var.btBenden.requestFocus();
            Var.btLaden.requestFocus();
            Var.btStart.setVisible(true);

        } else Var.jfl.requestFocus();


    }

}
