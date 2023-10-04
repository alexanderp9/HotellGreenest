package Hotell;

import javax.swing.*;

public class Cactus extends Plants implements HotellInstructions {

    public Cactus(double heightOfPlant, String nameOfPlant) {
        super(heightOfPlant, nameOfPlant, LiquidType.MINERALVATTEN);
    }

    @Override
    public double calculateLiquidAmount() {
        return 0.02;
    }
}
