package start;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public abstract class Key implements KeyListener {

    static int tempKeyhandler = 0;


    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            moveright = true;
            donot = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
            moveleft = true;
            donot = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP) {
            jump = true;
            donot = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN) {
            down = true;
            donot = false;
        }

        if (inHauptmeü) {

            if (tempKeyhandler == 0) {

                //Pause
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {

                    ingame = false;
                    inPause = true;
                    btHauptmeü.setVisible(true);
                    btOptionen.setVisible(true);
                    btNeuStard.setVisible(true);
                    btFortsetzen.setVisible(true);
                    tempKeyhandler++;
                }


            } else if (tempKeyhandler == 1) {


                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {

                    ingame = true;
                    inPause = false;
                    btHauptmeü.setVisible(false);
                    btOptionen.setVisible(false);
                    btNeuStard.setVisible(false);
                    btFortsetzen.setVisible(false);
                    tempKeyhandler--;

                    tempAktualisirung = 0;
                }


            }
        }

    }


    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT)
            moveright = false;
        donot = true;

        if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT)
            moveleft = false;
        donot = true;

        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP)
            jump = false;
        donot = true;

        if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN)
            down = false;
        donot = true;

    }


}


