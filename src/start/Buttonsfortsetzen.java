package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


// FIXME Datei ordentlich formatieren

// FIXME nicht von Var erben
// FIXME camelCase schreibweise
public class Buttonsfortsetzen extends Var {


    public Buttonsfortsetzen() {


        //Fortsetzen
        btFortsetzen = new JButton();
        btFortsetzen.setText("Fortsetzen");
        btFortsetzen.setBounds(300, 300, 140, 40);
        btFortsetzen.setVisible(false);
        btFortsetzen.addActionListener(new ActionHandler());
        btFortsetzen.setBackground(Color.gray);
        btFortsetzen.setFont(new Font("Arial", Font.PLAIN, 35));
        btFortsetzen.setForeground(Color.ORANGE);
        btFortsetzen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

               btFortsetzen.setBounds(300, 300, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                btFortsetzen.setBounds(300, 300, 140, 40);

            }


        });
        jfl.add(btFortsetzen);
















    }


}

