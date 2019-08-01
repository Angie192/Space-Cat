package start.action;

import java.awt.event.ActionListener;

public abstract class AbstractActionHandler implements ActionListener {

    public enum ButtonEnum {

        // BT = Betätigt( Maus ist auf Button), NBT = nicht betätigt

        EndeBT, EndeNBT, FortsetzenBT, FortsetzenNBT, HauptmenüBT, HauptmenüNBT, LadenBT, LadenNBT,
        NeuStartBT, NeuStartNBT, OptionenBT, OptionenNBT, OptionenHauptBT, OptionenHauptNBT,
        StartBT, StartNBT, StummBT, StummNBT

    }


}
