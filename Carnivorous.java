package Hotell;

import javax.swing.*;

public class Carnivorous extends Plants implements HotellInstructions{
    public Carnivorous(double heightOfPlant, String nameOfPlant) {
        super(heightOfPlant, nameOfPlant, LiquidType.PROTEINDRYCK);
    }
    @Override
    public double calculateLiquidAmount() {
        return 0.1 + (0.2 * getHeightOfPlant());
    }
}

