/**
 * CSCI 1110 - Assignment 03
 * @author Brijesh Varsani
 * Brijesh Varsani - B00882318
 * This is Carrot class.
 */

package Foods;

import Farm.Soil;

public class Carrot extends Vegetable{

    /**
     * Carrot constructor
     */
    public Carrot(){
        super("Carrot", 750.32, 15 ,100);
        preferredSoil = Soil.Sand;
    }
}

