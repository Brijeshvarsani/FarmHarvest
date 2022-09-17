/**
 * CSCI 1110 - Assignment 03
 * @author Brijesh Varsani
 * Brijesh Varsani - B00882318
 * This is Food class.
 */

package Foods;
import Farm.Soil;
import java.util.*;

public abstract class Food implements Comparable<Food>{
    // declared all the variables
    private String name;
    private double sellPrice;
    private int daysSincePotted;
    private int requiredArea;
    private int daysToMature;
    protected Soil preferredSoil;

    /**
     * constructor
     * @param name name of food
     * @param sellPrice selling price of food
     * @param daysToMature days need to mature
     * @param requiredArea area need for food
     */
    public Food(String name, double sellPrice, int daysToMature, int requiredArea){
        this.name = name;
        this.sellPrice = sellPrice;
        this.daysToMature = daysToMature;
        this.requiredArea = requiredArea;
    }

    /**
     * method to access name
     * @return String name
     */
    public String getName(){
        return name;
    }

    /**
     * method to access selling price
     * @return double sell price
     */
    public double getSellPrice(){
        return sellPrice;
    }

    /**
     * methode to access preferred soil
     * @return preferred soil
     */
    public Soil getPreferredSoil() {
        return preferredSoil;
    }

    /**
     * method to access day for mature
     * @return int days to mature
     */
    public int getDaysToMature() {
        return daysToMature;
    }

    /**
     * method to access days since potted
     * @return int days since potted
     */
    public int getDaysSincePotted() {
        return daysSincePotted;
    }

    /**
     * mrthod to access required area
     * @return int required area
     */
    public int getRequiredArea() {
        return requiredArea;
    }

    /**
     * grow abstract method
     * @param soil Soil to grow
     * @return nothing
     */
    public abstract double grow(Soil soil);

    /**
     * method to grow food
     * @return double grow percentage
     */
    protected double grow(){
        daysSincePotted++;
        if(daysSincePotted >= daysToMature){
            return 1.00;
        }
        return (double)daysSincePotted/daysToMature;
    }

    /**
     * convert to string
     * @return converted string
     */
    public String toString(){
        return name + " (" + preferredSoil + ") - " + daysSincePotted + "/" + daysToMature + " days";
    }

    /**
     * interface
     * @param food food to compare
     * @return int 1,0,-1
     */
    public int compareTo(Food food){
        if (sellPrice < food.getSellPrice()){
            return 1;
        }else if(sellPrice > food.getSellPrice()){
            return -1;
        }else{
            return 0;
        }
    }

}