import com.sun.xml.internal.bind.v2.model.core.ID;

public class Wagon extends RollingStock
{
    private Parcel[] mParcels;
    private int mParcelCount;

    public Wagon(int ID)
    {
        super(ID, 32000); // Empty wagon weighs 32000 kilograms
        mParcels = new Parcel[100];
        mParcelCount = 0;
    }

    // Accessor methods
    public int getWagonID() {

        return this.getID();
    }

    public double getWeight() {
        double sum = 0;
        for (int i = 0; i < mParcels.length; i++) {
            sum = sum + mParcels[i].getWeight();
        }
        return sum + 32000;
    }
}