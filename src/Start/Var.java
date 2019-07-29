package Start;

import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Var {

    static JFrame jfl;
    static int screenwight = 800, screenhight = 1000;
    static int backgroundY1 = 4000, backgroundY2 = 0, backgroundspeed = 100;
    static int x = 275, y = 850, movespeed = 4, jumpspeed = 3;
    static boolean moveright = false, moveleft = false, jump = false, down = false, donot = true;
    static boolean kontakt = false, kontakt1 =false,kontakt2 =false,kontakt3 =false,  lose = false;
    static boolean ingame = true, inHauptmeü = false, inPause = false, inOptionen = false, inLaden = false;
    static boolean neustard = false;
    static Label label1;

    static int feindx[] = new int[4], feindy[] = new int[4];

    static int feindspeed[] = new int[4];
    static int monyX[] = new int[7], monyY[] = new int[7], monyspeed[] = new int[7];
    static int Dosen = 0, Leben = 3, maxLeben = 5;

    static JButton btNeuStard,  btFortsetzen,  btOptionen, btHauptmeü;
    static JButton btShtum;
    static JButton btStart, btBenden, btLaden, btOptionenHaupt;

    static BufferedImage ib1, ib2, ib3;
    static BufferedImage ic1, ic2, ic3, ic4, ic5,ic6, ic7, ic8, ic9,ic10;
    static BufferedImage ig1, ig1t;
    static BufferedImage im3;

    public Var() {
        try {

            //Backgreund
            ib1 = ImageIO.read(new File("rsc/Wa.png"));
            ib2 = ImageIO.read(new File("rsc/Wa.png"));
            ib3 = ImageIO.read(new File("rsc/H.png"));

            //Lissi
            ic1 = ImageIO.read(new File("rsc/Cat 1.png"));
            ic2 = ImageIO.read(new File("rsc/Cat 2.png"));
            ic3 = ImageIO.read(new File("rsc/Cat 3.png"));
            ic4 = ImageIO.read(new File("rsc/cat up.png"));
            ic5 = ImageIO.read(new File("rsc/cat down.png"));
            ic6 = ImageIO.read(new File("rsc/Cat AW.png"));
            ic7 = ImageIO.read(new File("rsc/Cat WD.png"));
            ic8 = ImageIO.read(new File("rsc/Cat SD.png"));
            ic9 = ImageIO.read(new File("rsc/Cat SA.png"));
            ic10 = ImageIO.read(new File("rsc/Aua.png"));

            //Gegner

            ig1 = ImageIO.read(new File("rsc/G1.png"));
            ig1t = ImageIO.read(new File("rsc/G1tot.png"));
            //Mony
            im3 = ImageIO.read(new File("rsc/M3.png"));




        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("Eror: Die Bilder laden nicht.");
        }

        //Gegner Geschwindigkeit
        feindspeed[0] = 1;
        feindspeed[1] = 3;
        feindspeed[2] = 4;
        feindspeed[3] = 2;

        //Geld Geschwindichkeit
        monyspeed[0] = 3;
        monyspeed[1] = 2;
        monyspeed[2] = 1;
        monyspeed[3] = 2;
        monyspeed[4] = 4;
        monyspeed[5] = 1;
        monyspeed[6] = 2;
    }
}