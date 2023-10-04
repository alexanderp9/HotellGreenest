package Hotell;

import javax.swing.*;

public abstract class Plants implements HotellInstructions {

    //inkapsling av höjden och namnet på plantan.
    private double heightOfPlant;
    private String nameOfPlant;

    private final LiquidType liquidType; // här lägger jag till en referens för själva vätsketypen

    public Plants(double heightOfPlant, String nameOfPlant, LiquidType liquidType) {  //constructor för själva plantan
        this.heightOfPlant = heightOfPlant;
        this.nameOfPlant = nameOfPlant;
        this.liquidType = liquidType;
    }
    @Override
    public void amountOfLiquidNeeded() {
        String liquidType = getLiquidType().toLowerCase();
        double liquidAmount = calculateLiquidAmount();
        JOptionPane.showMessageDialog(null, liquidAmount + "liter" + " " + liquidType);

    }
    public abstract double calculateLiquidAmount();
    public double getHeightOfPlant() {
        return heightOfPlant;
    }

    public String getNameOfPlant() {
        return nameOfPlant;
    }
    public LiquidType getLiquidType() {
        return liquidType;
    }


}





