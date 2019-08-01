package start.button;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractButton extends JButton {

    public AbstractButton() {

        setBackground(Color.gray);
        setVisible(false);
        setForeground(Color.ORANGE);
        setFont(new Font("Arial", Font.PLAIN, 35));

    }


}

