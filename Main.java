package Hotell;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Plants cactus1 = new Cactus(0.20, "Igge");
        Plants palm1 = new Palms(5, "Laura");
        Plants carnivarous1 = new Carnivorous(0.7, "Meatloaf");
        Plants palm2 = new Palms(1, "Olof");
        String userInputPlant;

        while (true) {
            userInputPlant = JOptionPane.showInputDialog("Vilken växt vill du mata?");
            if (userInputPlant == null) {
                break;
            }
            if (userInputPlant.equalsIgnoreCase(cactus1.getNameOfPlant())) {
                cactus1.amountOfLiquidNeeded();
            } else if (userInputPlant.equalsIgnoreCase(palm1.getNameOfPlant())) {
                palm1.amountOfLiquidNeeded();
            } else if (userInputPlant.equalsIgnoreCase(carnivarous1.getNameOfPlant())) {
                carnivarous1.amountOfLiquidNeeded();
            } else if (userInputPlant.equalsIgnoreCase(palm2.getNameOfPlant())) {
                palm2.amountOfLiquidNeeded();
            } else if (userInputPlant.isBlank()) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Error: Ange en växt som finns på hotellet.");
            }

        }
    }
}

