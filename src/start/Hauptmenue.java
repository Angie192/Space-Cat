package start;

public class Hauptmenue {

    public Hauptmenue() {

        if (Var.inHauptmeü == true) {

            Var.btStart.requestFocus();
            Var.btBenden.requestFocus();
            Var.btLaden.requestFocus();
            Var.btStart.setVisible(true);

        } else Var.jfl.requestFocus();


    }

}
