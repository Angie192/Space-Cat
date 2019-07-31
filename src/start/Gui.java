package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;



public class Gui extends JFrame{

    public Gui(final Config config) {


        new Back();
        new CatMove();
        new FeindMove();
        new FeindKontakt();
        new MoneySammeln();
        new Verloren();


        new Aktualisierung();
        new FortsetzenButton();
        new EndeButton();
        new HaupmeüButton();
        new LadenButton();
        new NeuStartButton();
        new OptionenButton();
        new OptionenHauptButton();
        new StartButton();
        new StummButton();

        Label label1;
        JFrame fenster = new JFrame();

        fenster.setSize(800, 1000);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
        fenster.setLayout((LayoutManager) null);
        fenster.setTitle("SpaceCat");
        fenster.setResizable(false);
        requestFocus();
        label1 = new Label();
        label1.setBounds(0, 0, 800, 1000);
        label1.setVisible(true);
        fenster.add(label1);
        fenster.addKeyListener(new Key());
    }
}
