/**
 * CSCI 1110 - Assignment 03
 * @author Brijesh Varsani
 * Brijesh Varsani - B00882318
 * This is AppleFarm class.
 */

package Farm;
import Foods.Apple;
import Foods.Food;

public class AppleFarm extends Farm{
    /**
     * AppleFarm constructor
     * @param totalArea total farm
     */
    public AppleFarm(int totalArea){

        super(totalArea, Soil.Loam);
    }

    /**
     *
     * method to seed the food
     * @param food food to seed
     * @return boolean true if can be seed, false is can't seed
     */
    @Override
    public boolean seedFood(Food food) {
        if(food.getName().equals("Apple")){
            return true;
        }
        else {
            return false;
        }
    }
}
