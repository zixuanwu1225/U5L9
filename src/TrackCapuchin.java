public class TrackCapuchin {
    private int locationOfMonkeyXAxis;
    private int locationOfMonkeyYAxis;
    private int locationOfFoodSourceXAxis;
    private int locationOfFoodSourceYAxis;

    public TrackCapuchin(int foodSourceXAxis,int foodSourceYAxis){
        locationOfFoodSourceXAxis = 0;
        locationOfFoodSourceYAxis = 0;
        locationOfFoodSourceYAxis = foodSourceYAxis;
        locationOfFoodSourceXAxis = foodSourceXAxis;
    }

    public int getLocationOfMonkeyXAxis() {
        return locationOfMonkeyXAxis;
    }

    public int getLocationOfMonkeyYAxis() {
        return locationOfMonkeyYAxis;
    }

    public int getLocationOfFoodSourceXAxis() {
        return locationOfFoodSourceXAxis;
    }

    public int getLocationOfFoodSourceYAxis() {
        return locationOfFoodSourceYAxis;
    }

    public void moveMonkey(int xCoords, int yCoords){
        locationOfMonkeyXAxis += xCoords;
        locationOfMonkeyYAxis += yCoords;
    }

    public double calcFoodDistance(){
        double xSq = (Math.pow((locationOfFoodSourceXAxis - locationOfMonkeyXAxis),2));
        double ySq = (Math.pow((locationOfFoodSourceYAxis - locationOfMonkeyYAxis),2));
        return  Math.sqrt(xSq+ySq);
    }

    public boolean isCloserthan(TrackCapuchin other){
        return calcFoodDistance() > other.calcFoodDistance();
    }
}
