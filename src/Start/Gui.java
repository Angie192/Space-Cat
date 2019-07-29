package Start;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui {

    public Gui() {



        Var.jfl = new JFrame();
        Var.jfl.setSize(Var.screenwight, Var.screenhight);
        Var.jfl.setLocationRelativeTo((Component)null);
        Var.jfl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Var.jfl.setVisible(true);
        Var.jfl.setLayout((LayoutManager)null);
        Var.jfl.setTitle("SpaceCat");
        Var.jfl.setResizable(false);
        Var.jfl.requestFocus();
        Var.jfl.addKeyListener(new Key());


        Var.label1 = new Label();
        Var.label1.setBounds( 0,0, Var.screenwight, Var.screenhight);
        Var.label1.setVisible(true);
        Var.jfl.add(Var.label1);





    }

}
