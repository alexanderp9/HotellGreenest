package Hotell;

import javax.swing.*;

public class Palms extends Plants implements HotellInstructions{

    public Palms(double heightOfPlant, String nameOfPlant) {
        super(heightOfPlant, nameOfPlant, LiquidType.KRANVATTEN);

    }
    @Override
    public double calculateLiquidAmount() {
        return 0.5 * getHeightOfPlant();
    }
}
