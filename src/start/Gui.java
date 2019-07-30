package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;


// TODO Gui von JFrame erben lassen
public class Gui extends JFrame{

    public Gui() {

        // TODO da Gui nun von JFrame erbt, müssen die Eigenschaften anderes gesetzt werden

        JFrame jfl;
        Label label1;


        jfl =new JFrame();
        jfl.setSize(800, 1000);
        jfl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfl.setVisible(true);
        jfl.setLayout((LayoutManager) null);
        jfl.setTitle("SpaceCat");
        jfl.setResizable(false);
        jfl.requestFocus();
        label1 = new Label();
        label1.setBounds(0, 0, 800, 1000);
        label1.setVisible(true);
        jfl.add(label1);
        jfl.addKeyListener(new Key() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
        });




    }

}
