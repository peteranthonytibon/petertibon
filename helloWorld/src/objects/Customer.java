package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Customer extends Person {

    private String address;
    private int telephoneNumber;
    private byte customerId;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public byte getCustomerId() {
        return customerId;
    }

    public void setCustomerId(byte customerId) {
        this.customerId = customerId;
    }



    @Override
    public String introduceYourself(){
        String firstName = getFirstName();
        String lastName = getLastName();

        return "Hi, Im " +firstName + lastName + " customer in CITE";
    }

    public String introduceYourself(String product){
        String firstName = getFirstName();
        String lastName = getLastName();

        return "Hi, Im " + firstName + lastName+ " and I want to buy "+ product;
    }
}
