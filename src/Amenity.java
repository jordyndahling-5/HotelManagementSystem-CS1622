/**
 * amenity class for other details about the hotel
 */
public class Amenity {
    private int numExcursions;
    private String foodPlan;
    private int numFridgeFood;

    //initial constructor
    public Amenity() {
        this.numExcursions = 0;
        this.foodPlan = "";
        this.numFridgeFood = 0;
    }

    /**
     * amenities constructor that takes input
     * @param numExcursions
     * @param foodPlan
     * @param numFridgeFood
     */
    public Amenity(int numExcursions, String foodPlan, int numFridgeFood) {
        this.numExcursions = numExcursions;
        this.foodPlan = foodPlan;
        this.numFridgeFood = numFridgeFood;
    }

    /**
     * returns value of attributes
     * @return
     */
    //Getters
    public int getNumExcursions() { return numExcursions; }
    public String getFoodPlan() { return foodPlan; }
    public int getNumFridgeFood() { return numFridgeFood; }

    //Setters

    /**
     * sets number of excursions value
     * @param numExcursions
     */
    public void setNumExcursions(int numExcursions) {
        this.numExcursions = numExcursions;
    }

    /**
     * sets food plan value
     * @param foodPlan
     */
    public void setFoodPlan(String foodPlan) {
        this.foodPlan = foodPlan;
    }

    /**
     * sets number of fridge food consumed value
     * @param numFridgeFood
     */
    public void setNumFridgeFood(int numFridgeFood) {
        this.numFridgeFood = numFridgeFood;
    }

    /**
     * toString function
     * @return
     */
    @Override
    public String toString() {
        return "Amenity{" +
                "Number of Excursions =" + numExcursions +
                "Food Plan =" + foodPlan +
                "Fridge Food Items Consumed =" + numFridgeFood +
                '}';
    }

}
