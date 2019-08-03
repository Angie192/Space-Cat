package start;

import start.button.*;
import start.time.*;

import javax.swing.*;
import java.awt.*;


public class Gui extends JFrame {

    private JButton btFortsetzen;
    private JButton btBenden;
    private JButton btNeuStart;
    private JButton btHauptmenü;
    private JButton btLaden;
    private JButton btOptionen;
    private JButton btHauptOptionen;
    private JButton btStart;
    private JButton btStumm;

    public Gui(final Config config) {


        new BackTimeHandler(config);
        new CatMoveTimeHandler(config);
        new FeindMovetTimeHandler(config);
        new FeindKontaktTimeHandler(config);
        new MoneySammelnTimeHandler(config);
        new VerlorenTimeHandler(config);
        new AktualisierungTimeHandler(config);

        // TODO die aktuelle Gui Referenz bei den Buttons reingeben
        btFortsetzen = new FortsetzenButton(this, EnumButton.FortsetzenBT);
        btBenden = new EndeButton();
        btHauptmenü = new HaupmeüButton();
        btLaden = new LadenButton();
        btNeuStart = new NeuStartButton();
        btOptionen = new OptionenButton();
        btHauptOptionen = new OptionenHauptButton();
        btStart = new StartButton();
        btStumm = new StummButton();


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

    public void updateUi(/* TODO EnumButton übergeben*/) {

        // TODO ui in ausgangszustand versetzen

        if (e.getSource() == btStart) { // TODO konkrete EnumButton abfragen für den jeweiligen Button
            // TODO abweichung vom ausgangszustand umsetzen

            // TODO ingame, inPause, inLaden, inOptionen, inHauptmenu als enum umsetzen
            ingame = true;
            inPause = false;
            inLaden = false;
            inOptionen = false;
            inHauptmenü = false;
            btHauptmenü.setVisible(false);
            btOptionen.setVisible(false);
            btNeuStart.setVisible(false);
            btFortsetzen.setVisible(false);
            btBenden.setVisible(false);
            btLaden.setVisible(false);
            btStart.setVisible(false);
            btStumm.setVisible(false);
            btHauptOptionen.setVisible(false);

            tempAktualisirung = 0;
            Key.tempKeyhandler = 0;


        }

    }

}
