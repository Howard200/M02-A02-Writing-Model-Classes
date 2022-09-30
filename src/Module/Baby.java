package Module;

public class Baby {

// Instance Variables
    private String name;
    private double weight;
    private double sleeptime;
    private double temperature;
    private String eatinghabits;
    private String mentalstatus;

    // Constructors
    public Baby() {

        name = "";
        weight = 0;
        sleeptime = 0;
        temperature = 0;
        eatinghabits = "";
        mentalstatus = "";

    }

    public Baby (String Name, double Weight, double SleepTime, String EatingHabits,
                 String MentalStatus){

        name = Name;
        weight = Weight;
        sleeptime = SleepTime;
        eatinghabits = EatingHabits;
        mentalstatus = MentalStatus;

    }

    // Set and Get methods


    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSleeptime(double sleeptime) {
        this.sleeptime = sleeptime;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setEatinghabits(String eatinghabits) {
        this.eatinghabits = eatinghabits;
    }

    public void setMentalstatus(String mentalstatus) {
        this.mentalstatus = mentalstatus;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getSleeptime() {
        return sleeptime;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getEatinghabits() {
        return eatinghabits;
    }

    public String getMentalstatus() {
        return mentalstatus;
    }
    @Override
    public String toString() {
        return getName()  + getWeight() +  getSleeptime()  + getTemperature() + getEatinghabits()
                + getMentalstatus();

    }
}


