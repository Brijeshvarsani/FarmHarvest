/**
 * CSCI 1110 - Assignment 03
 * @author Brijesh Varsani
 * Brijesh Varsani - B00882318
 * This is Vegetable class.
 */

package Foods;

import Farm.Soil;

public class Vegetable extends Food{

    // declared variable
    private int daysCounter = 1;

    /**
     * Vegetable constructor
     * @param name food name
     * @param sellPrice selling price for food
     * @param daysToMature days to mature for food
     * @param requiredArea area require for food
     */
    public Vegetable(String name, double sellPrice, int daysToMature, int requiredArea){
        super(name, sellPrice, daysToMature, requiredArea);
        preferredSoil = Soil.Loam;
    }

    /**
     * grow method to grow the vegetable
     * @param soil Soil to grow
     * @return double grow percentage
     */
    @Override
    public double grow(Soil soil) {
        if (soil == preferredSoil) {
            daysCounter++;
            return grow();
        } else if (daysCounter % 2 == 0) {
            daysCounter++;
            return grow();
        } else {
            daysCounter++;
        }
        return (double) getDaysSincePotted() / getDaysToMature();
    }
}

