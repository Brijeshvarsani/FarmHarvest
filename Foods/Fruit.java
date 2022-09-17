/**
 * CSCI 1110 - Assignment 03
 * @author Brijesh Varsani
 * Brijesh Varsani - B00882318
 * This is Fruit class.
 */

package Foods;

import Farm.Soil;

public class Fruit extends Food{

    // declared variable
    private int daysCounter = 1;

    /**
     * Fruit constructor
     * @param name name of food
     * @param sellPrice selling price of food
     * @param daysToMature days to mature
     * @param requiredArea area required
     */
    public Fruit(String name, double sellPrice, int daysToMature, int requiredArea){
        super(name, sellPrice, daysToMature, requiredArea);
        preferredSoil = Soil.Silt;
    }

    /**
     * grow method to grow the fruits
     * @param soil Soil to grow
     * @return double grow percentage
     */
    @Override
    public double grow(Soil soil) {
        if (soil == preferredSoil) {
            daysCounter++;
            return grow();
        } else if (daysCounter % 3 == 0) {
            daysCounter++;
            return grow();
        } else {
            daysCounter++;
        }
        return (double) getDaysSincePotted() / getDaysToMature();
    }
}