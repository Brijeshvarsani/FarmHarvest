/**
 * CSCI 1110 - Assignment 03
 * @author Brijesh Varsani
 * Brijesh Varsani - B00882318
 * This is apple class.
 */

package Foods;

import Farm.Soil;

public class Apple extends Fruit{

    /**
     * Apple constructor
     */
    public Apple(){
        super("Apple", 1250.00, 15,275);
        preferredSoil = Soil.Loam;
    }
}
