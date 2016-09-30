import exercises.Collections;
import exercises.myCollections;
import objects.Animal;
import objects.Customer;
import objects.Employee;
import objects.Person;

public class Main {

    public static void main(String[] args) {

        /**
         *
         * Primitive Types
         *
         */

        byte byteVariable = 122; //incompatible types
        short mediumRangeDecimalVariable = 3178; //number too large
        int decimalVariableUpTo = 20274657;
        long largeDecimalVariableFrom = -929372038154177808L;
        long largeDecimalVariableUpTo = 9222175197457185922L;
        float numberWithDecimalPlaces = 8.2f;
        double veryLargeNumberWithDecimalPlaces = 21412756215.2151251;
        boolean isTrueOrFalse = false;
        char singleCharacter = 'A';
        String someText = "This is string variable.";

        //System.out.println("Primitive Types: " + largeDecimalVariableFrom);

        /**
         *
         *  Objects(Getter & setter method)
         *
         */
//
//        Person person = new Person();
//        person.setFirstName("Peter Anthony ");
//        person.setLastName("Tibon");
//
//        String introduce = person.introduceYourself();
//        System.out.println(introduce);

        /**
         * TODO to create an animal class with properties with setters and getters/ properties must be different data type String, int and boolean.
         */

        Animal animal = new Animal();
        animal.setPetName("Fox");
        animal.setNumberOfLegs(5);
        animal.setEndangered(true);

        boolean getBoolean = animal.isEndangered();
        //System.out.println(getBoolean);
        String getString = animal.getPetName();
        //System.out.println(getString);

        String animals = animal.myAnimal();
        //System.out.println(animals);

        /**
         *
         * INHERITANCE
         *
         */

        Employee employee = new Employee();
        employee.setFirstName("Peter Anthony ");
        employee.setLastName("Tibon");
        String employees = employee.introduceYourself();

       // System.out.println("Employee: " + employees);

        Customer customer = new Customer();
        customer.setFirstName("Peter Anthony ");
        customer.setLastName("Tibon");
        String customers = customer.introduceYourself("Cakes");

       // System.out.println("Customer: " + customers);

        /**
         * POLYMORPHISM
         */

//        Person person1 = new Person("Peter Anthony", "Tibon");

        // IF STATEMENT
        if (getBoolean == true) {
            //System.out.println("The animal is endangered!");
        } else {
            //System.out.println("The animal is not endangered!");
        }

        // WHILE LOOPS
        int num = 1;
        int sum = 0;
        while(num <= 6){
            sum += num;
            num++;
        }
        //System.out.print(sum);
        //System.out.println(" ");

        // DO WHILE LOOPS
        int n = 1;
        do {
            //System.out.print(n);
            n++;
        }while (n <= 6);
        //System.out.println(" ");

        //FOR LOOPS
        int sumFor = 0;
        for(int numFor = 1; numFor <= 6 ; numFor++){
            sumFor+=numFor;
        }
        //System.out.print(sumFor);
        //System.out.println(" ");

        String[] myInstructor = {"Neil", "Bert", "Amille"};

        for(int x = 0; x <= 2; x++) {
            if (myInstructor[x].equals("Bert")) {
                myInstructor[x] = "Amante";
            }
           // System.out.println(myInstructor[x]);
        }
        myCollections.randomNumber();
    }

}