package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Animal {

    private String petName;
    private int numberOfLegs;
    private boolean endangered;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }

    public String myAnimal(){;
        return "The quick brown "+ petName+ " " + "jumps "+ endangered+ " " + "the " + numberOfLegs + " " + "dogs.";
    }
}
