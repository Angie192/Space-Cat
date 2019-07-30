package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;



public class Gui extends JFrame{

    public Gui() {


        // FIXME kein jfl
        JFrame jfl;
        Label label1;

        // FIXME kein jfl
        jfl =new JFrame();
        // FIXME nicht auf jfl setzen
        jfl.setSize(800, 1000);
        // FIXME nicht auf jfl setzen
        jfl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // FIXME nicht auf jfl setzen
        jfl.setVisible(true);
        // FIXME nicht auf jfl setzen
        jfl.setLayout((LayoutManager) null);
        // FIXME nicht auf jfl setzen
        jfl.setTitle("SpaceCat");
        // FIXME nicht auf jfl setzen
        jfl.setResizable(false);
        // FIXME nicht auf jfl setzen
        jfl.requestFocus();
        // FIXME nicht auf jfl setzen
        label1 = new Label();
        label1.setBounds(0, 0, 800, 1000);
        label1.setVisible(true);
        // FIXME nicht auf jfl setzen
        jfl.add(label1);
        // FIXME nicht auf jfl setzen
        jfl.addKeyListener(new Key() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
        });




    }

}
