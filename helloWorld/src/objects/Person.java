package objects;

import com.sun.deploy.perf.PerfRollup;

/**
 * Created by jpmc on 9/28/2016.
 */
public abstract class Person {

    private String firstName;
    private String lastName;
    private String emailAddress;

    /**
     * Encapsulation binds together the data and functions that manipulate the data, and that keeps both safe from
     * outside interface and misuse.
     */

    public void setFirstName(String firstName){

        /* TODO check if strings is from a-z. */
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String introduceYourself(){
        return "Hi, I'm " + firstName + lastName;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(){

    }
}