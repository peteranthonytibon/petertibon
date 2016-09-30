package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Employee extends Person{

/*

    private String department;
    private double payGrade;
    private byte employeeId;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(double payGrade) {
        this.payGrade = payGrade;
    }

    public byte getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(byte employeeId) {
        this.employeeId = employeeId;
    }
*/



    @Override
    public String introduceYourself(){
        String firstName = getFirstName();
        String lastName = getLastName();

        return "Hi, Im " + firstName + lastName+  " working for CITE";
    }
}
