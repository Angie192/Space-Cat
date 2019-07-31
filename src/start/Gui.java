package start;

import start.button.*;
import start.time.*;

import javax.swing.*;
import java.awt.*;


public class Gui extends JFrame {

    public Gui(final Config config) {


        new BackTimeHandler();
        new CatMoveTimeHandler();
        new FeindMovetTimeHandler();
        new FeindKontaktTimeHandler();
        new MoneySammelnTimeHandler();
        new VerlorenTimeHandler();


        new VerlorenTimeHandler.Aktualisierung();
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
        addKeyListener(new Key());
    }
}
