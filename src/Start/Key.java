package Start;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key implements KeyListener {

   static int tempKeyhandler = 0;

    public void keyTyped(KeyEvent e){
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Var.moveright = true;
            Var.donot = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
            Var.moveleft = true;
            Var.donot = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP) {
            Var.jump = true;
            Var.donot = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.down = true;
            Var.donot = false;
        }

        if (Var.inHauptmeü == false) {

            if (tempKeyhandler == 0) {

                //Pause
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {

                    Var.ingame = false;
                    Var.inPause = true;
                   Var.btHauptmeü.setVisible(true);
                    Var.btOptionen.setVisible(true);
                    Var.btNeuStard.setVisible(true);
                    Var.btFortsetzen.setVisible(true);
                    tempKeyhandler ++;
                }


            } else if (tempKeyhandler == 1) {


                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {

                    Var.ingame = true;
                    Var.inPause = false;
                    Var.btHauptmeü.setVisible(false);
                    Var.btOptionen.setVisible(false);
                    Var.btNeuStard.setVisible(false);
                    Var.btFortsetzen.setVisible(false);
                    tempKeyhandler --;

                    Aktualsisrung.tempAktualisirung = 0;
                }


            }
        }

    }


    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT)
            Var.moveright=false;
            Var.donot = true;

            if(e.getKeyCode()==KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT)
            Var.moveleft=false;
            Var.donot = true;

        if(e.getKeyCode()==KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP)
            Var.jump=false;
            Var.donot = true;

        if (e.getKeyCode()==KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN)
            Var.down = false;
            Var.donot = true;

    }


}


