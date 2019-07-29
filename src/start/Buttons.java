package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


// TODO mehrere button klassen erstellen (btFortsetzen, btNeustart, btOptionen, btMenu, btStart, btBeenden, btLaden, bt...)
public class Buttons {


    public Buttons() {


        //Fortsetzen
        Var.btFortsetzen = new JButton();
        Var.btFortsetzen.setText("Fortsetzen");
        Var.btFortsetzen.setBounds(300, 300, 140, 40);
        Var.btFortsetzen.setVisible(false);
        Var.btFortsetzen.addActionListener(new ActionHandler());
        Var.btFortsetzen.setBackground(Color.gray);
        Var.btFortsetzen.setFont(new Font("Arial", Font.PLAIN, 35));
        Var.btFortsetzen.setForeground(Color.ORANGE);
        Var.btFortsetzen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                Var.btFortsetzen.setBounds(300, 300, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                Var.btFortsetzen.setBounds(300, 300, 140, 40);

            }


        });
        Var.jfl.add(Var.btFortsetzen);

        //Neu Stard
        Var.btNeuStard = new JButton();
        Var.btNeuStard.setText("Neu Stard");
        Var.btNeuStard.setBounds(300, 380, 140, 40);
        Var.btNeuStard.setVisible(false);
        Var.btNeuStard.addActionListener(new ActionHandler());
        Var.btNeuStard.setBackground(Color.gray);
        Var.btNeuStard.setFont(new Font("Arial", Font.PLAIN, 35));
        Var.btNeuStard.setForeground(Color.ORANGE);
        Var.btNeuStard.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                Var.btNeuStard.setBounds(300, 380, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                Var.btNeuStard.setBounds(300, 380, 140, 40);

            }


        });
        Var.jfl.add(Var.btNeuStard);

        //Optione
        Var.btOptionen = new JButton();
        Var.btOptionen.setText("Optionen");
        Var.btOptionen.setBounds(300, 460, 140, 40);
        Var.btOptionen.setVisible(false);
        Var.btOptionen.addActionListener(new ActionHandler());
        Var.btOptionen.setBackground(Color.gray);
        Var.btOptionen.setFont(new Font("Arial", Font.PLAIN, 35));
        Var.btOptionen.setForeground(Color.ORANGE);
        Var.btOptionen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                Var.btOptionen.setBounds(300, 460, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                Var.btOptionen.setBounds(300, 460, 140, 40);

            }


        });
        Var.jfl.add(Var.btOptionen);

        //Hauptmeü
        Var.btHauptmeü = new JButton();
        Var.btHauptmeü.setText("Hauptmeü");
        Var.btHauptmeü.setBounds(300, 540, 140, 40);
        Var.btHauptmeü.setVisible(false);
        Var.btHauptmeü.addActionListener(new ActionHandler());
        Var.btHauptmeü.setBackground(Color.gray);
        Var.btHauptmeü.setFont(new Font("Arial", Font.PLAIN, 35));
        Var.btHauptmeü.setForeground(Color.ORANGE);
        Var.btHauptmeü.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                Var.btHauptmeü.setBounds(300, 540, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                Var.btHauptmeü.setBounds(300, 540, 140, 40);

            }


        });
        Var.jfl.add(Var.btHauptmeü);

        // Stard positin noch nicht angepast
        Var.btStart = new JButton();
        Var.btStart.setText("Stard");
        Var.btStart.setBounds(300, 540, 140, 40);
        Var.btStart.setVisible(false);
        Var.btStart.addActionListener(new ActionHandler());
        Var.btStart.setBackground(Color.gray);
        Var.btStart.setFont(new Font("Arial", Font.PLAIN, 35));
        Var.btStart.setForeground(Color.ORANGE);
        Var.btStart.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                Var.btStart.setBounds(300, 540, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                Var.btStart.setBounds(300, 540, 140, 40);

            }


        });
        Var.jfl.add(Var.btStart);

        // Beenden positin noch nicht angepast
        Var.btBenden = new JButton();
        Var.btBenden.setText("Beenden");
        Var.btBenden.setBounds(300, 540, 140, 40);
        Var.btBenden.setVisible(false);
        Var.btBenden.addActionListener(new ActionHandler());
        Var.btBenden.setBackground(Color.gray);
        Var.btBenden.setFont(new Font("Arial", Font.PLAIN, 35));
        Var.btBenden.setForeground(Color.ORANGE);
        Var.btBenden.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                Var.btBenden.setBounds(300, 540, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                Var.btBenden.setBounds(300, 540, 140, 40);

            }


        });
        Var.jfl.add(Var.btBenden);

        // Laden positin noch nicht angepast
        Var.btLaden = new JButton();
        Var.btLaden.setText("Laden");
        Var.btLaden.setBounds(300, 540, 140, 40);
        Var.btLaden.setVisible(false);
        Var.btLaden.addActionListener(new ActionHandler());
        Var.btLaden.setBackground(Color.gray);
        Var.btLaden.setFont(new Font("Arial", Font.PLAIN, 35));
        Var.btLaden.setForeground(Color.ORANGE);
        Var.btLaden.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                Var.btLaden.setBounds(300, 540, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                Var.btLaden.setBounds(300, 540, 140, 40);

            }


        });
        Var.jfl.add(Var.btLaden);

        // optionenHaupt positin noch nicht angepast
        Var.btOptionenHaupt = new JButton();
        Var.btOptionenHaupt.setText("Optionen");
        Var.btOptionenHaupt.setBounds(300, 540, 140, 40);
        Var.btOptionenHaupt.setVisible(false);
        Var.btOptionenHaupt.addActionListener(new ActionHandler());
        Var.btOptionenHaupt.setBackground(Color.gray);
        Var.btOptionenHaupt.setFont(new Font("Arial", Font.PLAIN, 35));
        Var.btOptionenHaupt.setForeground(Color.ORANGE);
        Var.btOptionenHaupt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                Var.btOptionenHaupt.setBounds(300, 540, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                Var.btOptionenHaupt.setBounds(300, 540, 140, 40);

            }


        });
        Var.jfl.add(Var.btOptionenHaupt);


        // stum positin noch nicht angepast
        Var.btShtum = new JButton();
        Var.btShtum.setText("Optionen");
        Var.btShtum.setBounds(300, 540, 140, 40);
        Var.btShtum.setVisible(false);
        Var.btShtum.addActionListener(new ActionHandler());
        Var.btShtum.setBackground(Color.gray);
        Var.btShtum.setFont(new Font("Arial", Font.PLAIN, 35));
        Var.btShtum.setForeground(Color.ORANGE);
        Var.btShtum.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                Var.btShtum.setBounds(300, 540, 150, 50);

            }

            public void mouseExited(MouseEvent e) {

                Var.btShtum.setBounds(300, 540, 140, 40);

            }


        });
        Var.jfl.add(Var.btShtum);


    }


}
