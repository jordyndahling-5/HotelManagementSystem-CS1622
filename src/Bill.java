/**
 * class for the bill charged
 */
public class Bill {
    private int costRoom;
    private int costFoodPlan;
    private int costExcursions;
    private int costFridgeFood;
    private int totalCost;

    //initial constructor
    public Bill() {

        this.costFoodPlan = 0;
        this.costExcursions = 0;
        this.costFridgeFood = 0;
        this.totalCost = 0;
    }

    /**
     * bill constructor that takes inputs
     * @param costRoom
     * @param costFoodPlan
     * @param costExcursions
     * @param costFridgeFood
     * @param totalCost
     */
    public Bill(int costRoom, int costFoodPlan, int costExcursions, int costFridgeFood,
                int totalCost) {
        this.costRoom = costRoom;
        this.costFoodPlan = costFoodPlan;
        this.costExcursions = costExcursions;
        this.costFridgeFood = costFridgeFood;
        this.totalCost = totalCost;
    }

    //Getters

    /**
     * returns values of attributes
     * @return
     */
    public int getCostRoom() { return costRoom; }
    public int getCostFoodPlan() { return costFoodPlan; }
    public int getCostExcursions() { return costExcursions; }
    public int getCostFridgeFood() { return costFridgeFood; }
    public int getTotalCost() { return totalCost; }

    //Setters

    /**
     * sets cost of room value
     * @param costRoom
     */
    public void setCostRoom(int costRoom) {
        this.costRoom = costRoom;
    }

    /**
     * sets cost of food plan value
     * @param costFoodPlan
     */
    public void setCostFoodPlan(int costFoodPlan) {
        this.costFoodPlan = costFoodPlan;
    }

    /**
     * sets cost of excursions value
     * @param costExcursions
     */
    public void setCostExcursions(int costExcursions) {
        this.costExcursions = costExcursions;
    }

    /**
     * sets cost of fridge food value
     * @param costFridgeFood
     */
    public void setCostFridgeFood(int costFridgeFood) {
        this.costFridgeFood = costFridgeFood;
    }

    /**
     * sets total cost value
     * @param totalCost
     */
    public void setTotalCost (int totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * toString function
     * @return
     */
    @Override
    public String toString() {
        return "Bill{" +
                "Room Cost =" + costRoom +
                ", Food Plan Cost =" + costFoodPlan +
                ", Excursions Cost =" + costExcursions +
                ", Fridge Food Cost =" + costFridgeFood +
                ", Total Cost =" + totalCost +
                '}';
    }


}
