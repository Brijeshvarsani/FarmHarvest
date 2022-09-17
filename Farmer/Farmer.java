/**
 * CSCI 1110 - Assignment 03
 * @author Brijesh Varsani
 * Brijesh Varsani - B00882318
 * This is Farmer class.
 */

package Farmer;

import Farm.Farm;
import Foods.Food;
import Foods.Fruit;
import Foods.Vegetable;

public class Farmer {

    // declared the variables
    private String name;
    private int energy;
    private Farm farm;

    /**
     * Farmer constructor
     * @param name name
     */
    public Farmer(String name){
        this.name = name;
        this.energy = 100;
    }

    /**
     * Farmer constructor
     * @param name name of farmer
     * @param farm farm of farmer
     */
    public Farmer(String name, Farm farm){
        this.farm = farm;
        this.name = name;
        this.energy = 100;
    }

    /**
     * method to access food from farm
     * @param indexToAccess index number to access the food
     * @return food object
     */
    public Food getFoodFromFarm(int indexToAccess){
        return farm.getFood(indexToAccess);
    }

    /**
     * methiod to access name
     * @return String name
     */
    public String getName(){
        return name;
    }

    /**
     * method to access energy
     * @return int energy
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * method to recovers the energy of farmer and max energy can be 100 and grow the food
     */
    public void sleep(){

        energy += 35;
        if (energy > 100) {
            energy = 100;
        }

        farm.overnightGrow();
    }

    /**
     * method to see the food
     * @param foodToSeed food to be seed
     * @return boolean true if can be seed, false if can not
     */
    public boolean seedFood(Food foodToSeed){

        if((this.farm != null)
        ){

            if(foodToSeed instanceof Vegetable && energy>= 30){
                farm.seedFood(foodToSeed);
                energy -= 30;
                return true;
            }else if(foodToSeed instanceof Fruit && energy >= 50){
                farm.seedFood(foodToSeed);
                energy -= 50;
                return true;
            }
        }
        return false;
    }

    /**
     * method to buy the farm
     * @param farmToBought farm to be bought
     * @return boolean true farm bought, false it not bought
     */
    public boolean buyFarm(Farm farmToBought){

        if(farm != null){
            return false;
        }else{
            farm = farmToBought;
            return true;
        }
    }

    /**
     * converts to the string
     * @return returns the converted string with farmer ad his farm ifo
     */
    public String toString(){
        String finalPrint = "Farmer: " + name + "\nEnergy left: " + energy + "/100\n";

        if(this.farm == null){
            return finalPrint + name + " owns no farm";
        }else{
            return  finalPrint + "Farm info:\n" + farm.toString();
        }
    }
}
