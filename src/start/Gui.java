package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;



public class Gui extends JFrame{

    public Gui() {


        new Back();
        new CatMove();
        new FeindMove();
        new FeindKontakt();
        new MoneySammeln();
        new Verloren();


        new Aktualisierung();
        new fortsetzenButton();
        new EndeButton();
        new HaupmeüButton();
        new LadenButton();
        new NeuStartButton();
        new OptionenButton();
        new ButtonOptionenhaupt();
        new ButtonStard();
        new SthumButton();

        Label label1;


        new JFrame();

        setSize(800, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout((LayoutManager) null);
        setTitle("SpaceCat");
        setResizable(false);
        requestFocus();
        label1 = new Label();
        label1.setBounds(0, 0, 800, 1000);
        label1.setVisible(true);
        add(label1);
        addKeyListener(new Key() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
        });




    }

}
