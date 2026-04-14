/**
 * amenity class for other details about the hotel
 */
public class Amenity implements Chargeable{
    private int numExcursions;
    private String foodPlan;
    private int numFridgeFood;
    private int costFoodPlan;
    private int amenityCost;

    //initial constructor
    public Amenity() {
        this.numExcursions = 0;
        this.foodPlan = "";
        this.numFridgeFood = 0;
        this.costFoodPlan = 0;
    }

    /**
     * amenities constructor that takes input
     * @param numExcursions
     * @param foodPlan
     * @param numFridgeFood
     * @param amenityCost;
     * @param costFoodPlan
     */
    public Amenity(int numExcursions, String foodPlan, int numFridgeFood, int amenityCost, int costFoodPlan) {
        this.numExcursions = numExcursions;
        this.foodPlan = foodPlan;
        this.numFridgeFood = numFridgeFood;
        this.amenityCost = amenityCost;
        this.costFoodPlan = costFoodPlan;
    }

    /**
     * returns value of attributes
     * @return
     */
    //Getters
    public int getNumExcursions() { return numExcursions; }
    public String getFoodPlan() { return foodPlan; }
    public int getNumFridgeFood() { return numFridgeFood; }
    public int getAmenityCost() {return amenityCost;}
    public int getCostFoodPlan() {return costFoodPlan;}

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
     * calculates the cost of person's food plan
     * @param foodPlan
     */
    public void calcCostFoodPlan(String foodPlan) {
        if (foodPlan.equals("Buffet")) {
            costFoodPlan = 20;
        } else {
            costFoodPlan = 0;
        }
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

    /**
     * calculates the amenity cost
     */
    @Override
    public void calcCost() {
        amenityCost = (numExcursions * 20) + (costFoodPlan) + (numFridgeFood * 5); }
}
