package Module;

public class Weight extends Baby{

    // Instance Variables
    private int pound;
    private int ounce;

    // Constructor
    public Weight(){

        pound = 0;
        ounce = 0;
    }

    public Weight(int Pound, int Ounce){
        pound = Pound;
        ounce = Ounce;

    }

    // Set and Get Methods

    public void setPound(int pound) {
        this.pound = pound;
    }

    public void setOunce(int ounce) {
        this.ounce = ounce;
    }

    public int getPound() {
        return pound;
    }

    public int getOunce() {
        return ounce;
    }
}
