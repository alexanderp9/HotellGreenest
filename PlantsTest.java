package Hotell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PlantsTest {

    @Test
    void testcalculateLiquidAmount() {
        Plants cactus1 = new Cactus(5, "test1");
        Plants palm1 = new Palms(4, "test2");
        Plants carnivarous1 = new Carnivorous(0.7, "test3");

        double calculateCactus = cactus1.calculateLiquidAmount();
        double calculatePalm = palm1.calculateLiquidAmount();
        double calculateCarnivarous = carnivarous1.calculateLiquidAmount();

        assertEquals(0.02, calculateCactus, 0.001, "Fel på kaktus kalkylationen");
        assertEquals(2, calculatePalm, 0.001, "Fel på palm kalkylationen");
        assertEquals(0.24, calculateCarnivarous, 0.001, "Fel på Köttandeväxt kalkylationen");

    }
}