package start;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;




public class Config {


    public Config() {
        try {

            // FIXME die bilder werden nun ins leere gelesen... die Bilder sollen in attribute innerhalb der config gespeichert werden
            //Backgreund
            ImageIO.read(new File("rsc/Wa.png"));
            ImageIO.read(new File("rsc/Wa.png"));
            ImageIO.read(new File("rsc/H.png"));

            //Lissi
            ImageIO.read(new File("rsc/Cat 1.png"));
            ImageIO.read(new File("rsc/Cat 2.png"));
            ImageIO.read(new File("rsc/Cat 3.png"));
            ImageIO.read(new File("rsc/cat up.png"));
            ImageIO.read(new File("rsc/cat down.png"));
            ImageIO.read(new File("rsc/Cat AW.png"));
            ImageIO.read(new File("rsc/Cat WD.png"));
            ImageIO.read(new File("rsc/Cat SD.png"));
            ImageIO.read(new File("rsc/Cat SA.png"));
            ImageIO.read(new File("rsc/Aua.png"));

            //Gegner

            ImageIO.read(new File("rsc/G1.png"));
            ImageIO.read(new File("rsc/G1tot.png"));
            //Mony
            ImageIO.read(new File("rsc/M3.png"));


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
