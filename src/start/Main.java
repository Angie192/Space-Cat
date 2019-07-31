package start;

import java.io.ObjectInputFilter;

public abstract class Main {

    public static void main(final String[] args) {


        final Config config = new Config();

        new Gui(config);

    }

}
