package start;

import start.button.*;
import start.time.*;

import javax.swing.*;
import java.awt.*;


public class Gui extends JFrame {

    public Gui(final Config config) {


        new BackTimeHandler(config);
        new CatMoveTimeHandler(config);
        new FeindMovetTimeHandler(config);
        new FeindKontaktTimeHandler(config);
        new MoneySammelnTimeHandler(config);
        new VerlorenTimeHandler(config);
        new AktualisierungTimeHandler(config);

       FortsetzenButton btFortsetzen = new FortsetzenButton();
       EndeButton btBenden = new EndeButton();
       HaupmeüButton btHauptmenü = new HaupmeüButton();
       LadenButton btLaden = new LadenButton();
       NeuStartButton btNeuStart = new NeuStartButton();
       OptionenButton btOptionen = new OptionenButton();
       OptionenHauptButton btHauptOptionen = new OptionenHauptButton();
       StartButton btStart = new StartButton();
       StummButton btStumm = new StummButton();



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

    public void ButtonE() {


        if (e.getSource() == btStart) {

            ingame = true;
            inPause = false;
            inLaden = false;
            inOptionen = false;
            inHauptmeü = false;
            btHauptmeü.setVisible(false);
            btOptionen.setVisible(false);
            btNeuStard.setVisible(false);
            btFortsetzen.setVisible(false);
            btBenden.setVisible(false);
            btLaden.setVisible(false);
            btStart.setVisible(false);
            btShtum.setVisible(false);
            btOptionenHaupt.setVisible(false);

            tempAktualisirung = 0;
            Key.tempKeyhandler = 0;


    }

}

}
