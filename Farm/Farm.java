/**
 * CSCI 1110 - Assignment 03
 * @author Brijesh Varsani
 * Brijesh Varsani - B00882318
 * This is Farm class.
 */
package Farm;

import Foods.Food;

import java.util.ArrayList;

public class Farm {

    // declared variables
    private int totalArea;
    private ArrayList<Food> foods = new ArrayList<>();
    private Soil farmSoil;
    private double getHarvestValue;
    private double areaUsedSoFar;

    /**
     * Farm constructor
     * @param totalArea total area of farm
     * @param farmSoil soil of the farm
     */
    public Farm(int totalArea, Soil farmSoil){
        this.totalArea = totalArea;
        this.farmSoil = farmSoil;
    }

    /**
     * method to access total area
     * @return int area of farm
     */
    public int getTotalArea() {
        return totalArea;
    }

    /**
     * method to access the soil of farm
     * @return Soil object
     */
    public Soil getFarmSoil() {
        return farmSoil;
    }

    /**
     * method to access food quantity
     * @return int number of foods
     */
    public int getFoodQuantity(){
        return foods.size();
    }

    /**
     * method to get the food
     * @param index index number by which we access food
     * @return return the food object
     */
    public Food getFood(int index){
        return foods.get(index);
    }

    /**
     * method to count total farm value for ready to harvest food
     * @return double ready to harvest food
     */
    public double getReadyToHarvestValue(){

        for(int i = 0; i < foods.size(); i++){
            if(foods.get(i).getDaysSincePotted() >= foods.get(i).getDaysToMature()){
                getHarvestValue += foods.get(i).getSellPrice();
            }
        }
        return getHarvestValue;
    }

    /**
     * method to get total farm value
     * @return double total farm value
     */
    public double getTotalFarmValue(){
        double farmTotalValue = 0;
        for(int i = 0; i < foods.size(); i++){
            farmTotalValue += foods.get(i).getSellPrice();
        }
        return farmTotalValue;
    }

    /**
     * method to grow food
     */
    public void overnightGrow(){
        for(int i = 0; i < foods.size(); i++){
            foods.get(i).grow(farmSoil);
        }
    }

    /**
     * method to seed the food
     * @param foodToSeed food to seed
     * @return boolean true if seeded , false if not seeded
     */
    public boolean seedFood(Food foodToSeed){

        for(int i = 0; i < foods.size(); i++){
            areaUsedSoFar += foods.get(i).getRequiredArea();
        }
        if((totalArea - areaUsedSoFar) < foodToSeed.getRequiredArea()){
            return false;
        }else{
            foods.add(foodToSeed);
            return true;
        }
    }

    /**
     * method to harvest the food
     * @param index index number to harvest the food number
     * @return harvested food object
     */
    public Food harvestFood(int index){
        if((foods != null)){
            if (foods.get(index).getDaysSincePotted() >= foods.get(index).getDaysToMature()){

                areaUsedSoFar -= foods.get(index).getRequiredArea();
                Food food = foods.remove(index);
                return food;
            }
        }
        return null;
    }

    /**
     * convert to string
     * @return converted String
     */
    public String toString(){
        String availableFood = "";
        String finalString = "Total farm value: " + String.format("%.2f", getTotalFarmValue()) + "\nReady to harvest value: " + String.format("%.2f", getReadyToHarvestValue());
        for(int i = 0; i < foods.size(); i++){
            availableFood += i + " - " + foods.get(i).toString() + "\n";
        }
        if(foods.size() > 0) {
            return finalString + "\nFood available:\n" + availableFood;
        }else{
            return finalString + "\nNo food available";
        }


    }
}

