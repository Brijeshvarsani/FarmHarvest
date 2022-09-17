/**
 * CSCI 1110 - Assignment 03
 * @author Brijesh Varsani
 * Brijesh Varsani - B00882318
 * This is Cabbage class.
 */

package Foods;

import Farm.Soil;

public class Cabbage extends Vegetable{

    /**
     * Cabbage constructor
     */
    public Cabbage(){
        super("Cabbage",239.75, 10,50);
        preferredSoil = Soil.Clay;
    }
}
