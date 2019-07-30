package start;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Label extends JLabel {


    int screenwight = 800, screenhight = 1000;
    int backgroundY1 = 4000, backgroundY2 = 0, backgroundspeed = 100;
    int x = 275, y = 850, movespeed = 4, jumpspeed = 3;
    boolean moveright = false, moveleft = false, jump = false, down = false, donot = true;
    boolean kontakt = false, kontakt1 = false, kontakt2 = false, kontakt3 = false, lose = false;
    boolean ingame = true, inHauptmeü = false, inPause = false, inOptionen = false, inLaden = false;
    boolean neustard = false;

    int feindx[] = new int[4], feindy[] = new int[4];

    int feindspeed[] = new int[4];
    int monyX[] = new int[7], monyY[] = new int[7], monyspeed[] = new int[7];
    int Dosen = 0, Leben = 3, maxLeben = 5;



    BufferedImage ib1, ib2, ib3;
    BufferedImage ic1, ic2, ic3, ic4, ic5, ic6, ic7, ic8, ic9, ic10;
    BufferedImage ig1, ig1t;
    BufferedImage im3;

    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // TODO simpler
        if (ingame) {

            g.drawImage(ib1, 0, backgroundY1, null);
            g.drawImage(ib2, 0, backgroundY2, null);


            repaint();

            //Mony
            for (int u = 0; u <= 6; u++) {

                g.drawImage(im3, monyX[u], monyY[u], 75, 55, null);
            }


            // Lissi
            // TODO simpler
            if (kontakt || kontakt1 || kontakt2 || kontakt3) {
                g.drawImage(ic10, x - 20, y, null);
            // TODO simpler
            } else if (moveleft && jump) {
                g.drawImage(ic6, x, y, null);
            // TODO simpler
            } else if (jump && moveright ) {
                g.drawImage(ic7, x, y, null);
            // TODO simpler
            } else if (down && moveright) {
                g.drawImage(ic8, x, y, null);
            // TODO simpler
            } else if (down && moveleft) {
                g.drawImage(ic9, x, y, null);
            // TODO simpler
            } else if (moveleft) {
                g.drawImage(ic3, x, y, null);
            // TODO simpler
            } else if (jump) {
                g.drawImage(ic4, x, y, null);
            // TODO simpler
            } else if (moveright) {
                g.drawImage(ic1, x, y, null);
            // TODO simpler
            } else if (donot) {
                g.drawImage(ic2, x, y, null);

                // TODO simpler
            } else if (down) {
                g.drawImage(ic5, x, y, null);
            }


            // Gegener

            for (int i = 0; i <= 3; i++) {
                // TODO simpler
                if (kontakt) {
                    g.drawImage(ig1t, feindx[0] - 48, feindy[0], null);

                } else {
                    g.drawImage(ig1, feindx[0], feindy[0], 110, 113, null);

                }
                // TODO simpler
                if (kontakt1) {
                    g.drawImage(ig1t, feindx[1] - 48, feindy[1], null);

                } else {
                    g.drawImage(ig1, feindx[1], feindy[1], 110, 113, null);

                }
                // TODO simpler
                if (kontakt2) {
                    g.drawImage(ig1t, feindx[2] - 48, feindy[2], null);

                } else {
                    g.drawImage(ig1, feindx[2], feindy[2], 110, 113, null);

                }
                // TODO simpler
                if (kontakt3) {
                    g.drawImage(ig1t, feindx[3] - 48, feindy[3], null);

                } else {
                    g.drawImage(ig1, feindx[3], feindy[3], 110, 113, null);
                }


                g.setColor(Color.BLUE);
                g.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
                g.drawString("Dosen: " + Dosen, 25, 900);


                g.setColor(Color.green);
                g.setFont(new Font("Arial", Font.BOLD, 35));
                g.drawString("Leben: " + Leben, 25, 950);

            }
            // TODO simpler
        } else if (inPause) {

            g.drawImage(ib1, 0, backgroundY1, null);
            g.drawImage(ib2, 0, backgroundY2, null);

            for (int u = 0; u <= 6; u++) {

                g.drawImage(im3, monyX[u], monyY[u], 75, 55, null);
            }

            g.drawImage(ic2, x, y, null);

            for (int i = 0; i <= 3; i++) {

                g.drawImage(ig1, feindx[i], feindy[i], null);
            }

            g.setColor(new Color(100, 100, 100, 128));
            g.fillRect(0, 0, screenwight, screenhight);

            // TODO simpler

                // TODO simpler
                if (lose ) {
                    g.setColor(Color.BLUE);
                    g.setFont(new Font("Zapata", Font.BOLD, 35));
                    g.drawString("Gesamelte Dosen: " + Dosen, 120, 400);


                    g.setColor(Color.red);
                    g.setFont(new Font("Zapata", Font.BOLD, 50));
                    g.drawString("Du hast Verloren", 100, 350);

                }


            // TODO simpler
        } else if (inHauptmeü || inOptionen || inLaden ) {

            g.drawImage(ib3, 0, 0, null);


        }
    }

}
