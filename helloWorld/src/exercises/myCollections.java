package exercises;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpmc on 9/30/2016.
 */

public class myCollections {
    public static String myFriends() {
        List<String> myFriends = new ArrayList<String>();

        myFriends.add("Chevy Banico");
        myFriends.add(1, "Cris John Aliparts");
        myFriends.add(2, "Daniel April Tingal");
        myFriends.add(3, "Fidel Soliano");
        myFriends.add(4, "Jeremiah Caballero");
        myFriends.add(5, "Roden Artuyo");
        myFriends.add(6, "Stephen Canono");
        myFriends.add(7, "Jhon Mark Carizon");

        int range = myFriends.size();
        int min = 0;

        return myFriends.get((int) (Math.random() * range) + min);
    }

    public static String myGirlFriend() {

        List<String> myGirlFriends = new ArrayList<String>();
        myGirlFriends.add("Angel Locsin");
        myGirlFriends.add(1, "Aom Sushar");
        myGirlFriends.add(2, "Janella Salvador");
        myGirlFriends.add(3, "Jennylyn Mercado");
        myGirlFriends.add(4, "Jessy Mendiola");
        myGirlFriends.add(5, "Kim Domingo");
        myGirlFriends.add(6, "Liza Soberano");
        myGirlFriends.add(7, "Taylor Swift");

        int range = myGirlFriends.size();
        int min = 0;
        return myGirlFriends.get((int) (Math.random() * range) + min);

    }

    public static String relationship() {
        List<String> myRelationship = new ArrayList<String>();
        myRelationship.add("love");
        myRelationship.add("hate");
        myRelationship.add("is complicated with");
        myRelationship.add("are friends with");
        myRelationship.add("friends with benefits");

        //Collections.shuffle(myRelationship);

        int range = myRelationship.size();
        int min = 0;
        return myRelationship.get((int) (Math.random() * range + min));
    }

    public static void randomNumber() {
        System.out.println(myFriends() + " " + relationship() + " " + myGirlFriend() + ".");
    }
}