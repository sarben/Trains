public class Train {
    private Engine[] mEngines;
    private Wagon[] mWagons;
    private int mEngineCount;
    private int mWagonCount;
    private int mTrainNumber;
    private double mWeight; // Total weight in kilograms

    public Train(int number) {
        mTrainNumber = number;
        mEngines = new Engine[6]; // The train can have up to 6 engines
        mEngineCount = 0;
        mWagons = new Wagon[100]; // The train can have up to 100 wagons
        mWagonCount = 0;
        mWeight = 0;
    }
    public void addEngine( Engine newEngine ) {
        mEngines[mEngineCount] = newEngine;
        mEngineCount++;
    }
    public Engine removeEngine() {
        mEngineCount--;
        return mEngines[mEngineCount];
    }
    public void addWagon( Wagon newWagon ) {
        mWagons[mWagonCount] = newWagon;
        mWagonCount++;
        mWeight = mWeight + 32000;
    }
    public Wagon removeWagon() {
        mWagonCount--;
        if (!(mWagonCount == 0)) {
            return mWagons[mWagonCount];
        } else {
            System.out.println("There are no wagons to remove.");
        }
    }
    public double getWeight() {
//returns the total combine weight of all the parcels, engines and wagons in a train
        double sum = 0;
        for (int i = 0; i < mWagons.length; i++){
            sum = sum + mWagons[i].getWeight();
        }
        return sum + mEngineCount * mEngines[0].getWeight();
    }
    public int getNumberOfWagons(){
        //returns number of wagons currently coupled to train;
        return mWagonCount;
    }
}