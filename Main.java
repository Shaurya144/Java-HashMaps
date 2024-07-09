// Hashmaps store items in "key/value" pairs, and you can access them by an index of another type 
// One object is used as a key (index) to another object (value).

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        // It makes sense
        // The key is linked to a value
        // use .put to add these components to the HashMap
        System.out.println(capitalCities);

        // To get values from a Hashmap use .get()
        capitalCities.get("England"); // prints London

        // To remove values from a Hashmap use .remove()
        capitalCities.remove("England");

        capitalCities.clear(); // to empty it / remove all items

        // To find out number of items use .size()
        capitalCities.size();

        // You can Loop through a HashMap using for loops
        for (String i : capitalCities.keySet()) {
            System.out.println(i); // this prints all the keys
        }

        for (String i : capitalCities.values()) {
            System.out.println(i); // this prints all the values
        }

        // For both just use the get method .get(i)
    }
}
