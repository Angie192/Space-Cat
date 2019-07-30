package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;




public class HaupmeüButton {


    public HaupmeüButton(){

         //Hauptmeü
         btHauptmeü = new JButton();
         btHauptmeü.setText("Hauptmeü");
         btHauptmeü.setBounds(300, 540, 140, 40);
         btHauptmeü.setVisible(false);
         btHauptmeü.addActionListener(new ActionHandler());
         btHauptmeü.setBackground(Color.gray);
         btHauptmeü.setFont(new Font("Arial", Font.PLAIN, 35));
         btHauptmeü.setForeground(Color.ORANGE);
         btHauptmeü.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseEntered(MouseEvent e) {

                  btHauptmeü.setBounds(300, 540, 150, 50);

              }

                public void mouseExited(MouseEvent e) {

                 btHauptmeü.setBounds(300, 540, 140, 40);

              }


         });
          jfl.add(btHauptmeü);



    }


}
