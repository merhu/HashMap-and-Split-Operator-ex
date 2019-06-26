import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Intialize the hashmap
        HashMap<Integer, String> myMap = new HashMap<Integer, String> ();


        //add keys and values

        myMap.put ( 1, "oklahoma" );
        myMap.put ( 2, "maryland" );
        myMap.put ( 3, "virginia" );

        //get the values corresponding to the key 3
        System.out.println ( "The value is " + myMap.get ( 3 ) );


        // check to see if " indiana" is in my hashmap
        String myVal = "indiana";
        boolean flag = false;
        if (flag) System.out.println ( myVal + " is in the hashmap." );
        else System.out.println ( myVal + " is not in the hashmap." );

// Split operator example
        String Str = new String ( " I really like this Java course!" );
        System.out.println ( "\n Return Value :" );

        for (String retval : Str.split ( " " )) {
            System.out.println ( retval );


        }
    }
}


