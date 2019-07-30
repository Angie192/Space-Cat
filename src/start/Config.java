package start;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;




public class Config {


    public Config() {
        try {

         Image ib1, ib2, ib3, ic1, ic2, ic3, ic4, ic5 ,ic6, ic7, ic8, ic9, ic10, ig1, ig1tot, im1;


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
            ig1tot = ImageIO.read(new File("rsc/G1tot.png"));

            //Mony
            im1 = ImageIO.read(new File("rsc/M3.png"));


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
