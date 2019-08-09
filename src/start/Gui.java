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


        btFortsetzen = new FortsetzenButton(this, EnumButton.FortsetzenNBT);
        btBenden = new EndeButton(this, EnumButton.EndeNBT);
        btHauptmenü = new HaupmeüButton(this, EnumButton.HauptmenüNBT);
        btLaden = new LadenButton(this,EnumButton.LadenNBT);
        btNeuStart = new NeuStartButton(this, EnumButton.NeuStartNBT);
        btOptionen = new OptionenButton(this, EnumButton.OptionenNBT);
        btHauptOptionen = new OptionenHauptButton(this, EnumButton.OptionenHauptNBT);
        btStart = new StartButton(this, EnumButton.StartNBT);
        btStumm = new StummButton(this, EnumButton.StartNBT);


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

    public void updateUi(EnumButton) {

        // TODO ui in ausgangszustand versetzen

        if () { // TODO konkrete EnumButton abfragen für den jeweiligen Button
            // TODO abweichung vom ausgangszustand umsetzen

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
