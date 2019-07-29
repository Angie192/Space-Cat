package start;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (Var.ingame == true) {

            g.drawImage(Var.ib1, 0, Var.backgroundY1, null);
            g.drawImage(Var.ib2, 0, Var.backgroundY2, null);


            repaint();

            //Mony
            for (int u = 0; u <= 6; u++) {

                g.drawImage(Var.im3, Var.monyX[u], Var.monyY[u], 75, 55, null);
            }


            // Lissi
            if (Var.kontakt == true || Var.kontakt1 == true || Var.kontakt2 == true || Var.kontakt3 == true) {
                g.drawImage(Var.ic10, Var.x - 20, Var.y, null);

            } else if (Var.moveleft == true && Var.jump == true) {
                g.drawImage(Var.ic6, Var.x, Var.y, null);

            } else if (Var.jump == true && Var.moveright == true) {
                g.drawImage(Var.ic7, Var.x, Var.y, null);

            } else if (Var.down == true && Var.moveright == true) {
                g.drawImage(Var.ic8, Var.x, Var.y, null);

            } else if (Var.down == true && Var.moveleft == true) {
                g.drawImage(Var.ic9, Var.x, Var.y, null);

            } else if (Var.moveleft == true) {
                g.drawImage(Var.ic3, Var.x, Var.y, null);

            } else if (Var.jump == true) {
                g.drawImage(Var.ic4, Var.x, Var.y, null);

            } else if (Var.moveright == true) {
                g.drawImage(Var.ic1, Var.x, Var.y, null);

            } else if (Var.donot == true) {
                g.drawImage(Var.ic2, Var.x, Var.y, null);

            } else if (Var.down == true) {
                g.drawImage(Var.ic5, Var.x, Var.y, null);
            }


            // Gegener

            for (int i = 0; i <= 3; i++) {
                if (Var.kontakt == true) {
                    g.drawImage(Var.ig1t, Var.feindx[0] - 48, Var.feindy[0], null);

                } else {
                    g.drawImage(Var.ig1, Var.feindx[0], Var.feindy[0], 110, 113, null);

                }
                if (Var.kontakt1 == true) {
                    g.drawImage(Var.ig1t, Var.feindx[1] - 48, Var.feindy[1], null);

                } else {
                    g.drawImage(Var.ig1, Var.feindx[1], Var.feindy[1], 110, 113, null);

                }
                if (Var.kontakt2 == true) {
                    g.drawImage(Var.ig1t, Var.feindx[2] - 48, Var.feindy[2], null);

                } else {
                    g.drawImage(Var.ig1, Var.feindx[2], Var.feindy[2], 110, 113, null);

                }
                if (Var.kontakt3 == true) {
                    g.drawImage(Var.ig1t, Var.feindx[3] - 48, Var.feindy[3], null);

                } else {
                    g.drawImage(Var.ig1, Var.feindx[3], Var.feindy[3], 110, 113, null);
                }


                g.setColor(Color.BLUE);
                g.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
                g.drawString("Dosen: " + Var.Dosen, 25, 900);


                g.setColor(Color.green);
                g.setFont(new Font("Arial", Font.BOLD, 35));
                g.drawString("Leben: " + Var.Leben, 25, 950);

            }

        } else if (Var.inPause == true) {

            g.drawImage(Var.ib1, 0, Var.backgroundY1, null);
            g.drawImage(Var.ib2, 0, Var.backgroundY2, null);

            for (int u = 0; u <= 6; u++) {

                g.drawImage(Var.im3, Var.monyX[u], Var.monyY[u], 75, 55, null);
            }

            g.drawImage(Var.ic2, Var.x, Var.y, null);

            for (int i = 0; i <= 3; i++) {

                g.drawImage(Var.ig1, Var.feindx[i], Var.feindy[i], null);
            }

            g.setColor(new Color(100, 100, 100, 128));
            g.fillRect(0, 0, Var.screenwight, Var.screenhight);

            if (Var.lose == true) {

                if (Var.lose == true) {
                    g.setColor(Color.BLUE);
                    g.setFont(new Font("Zapata", Font.BOLD, 35));
                    g.drawString("Gesamelte Dosen: " + Var.Dosen, 120, 400);


                    g.setColor(Color.red);
                    g.setFont(new Font("Zapata", Font.BOLD, 50));
                    g.drawString("Du hast Verloren", 100, 350);

                }
            }

        } else if (Var.inHauptmeü == true || Var.inOptionen == true || Var.inLaden == true) {

            g.drawImage(Var.ib3, 0, 0, null);


        }
    }

}
