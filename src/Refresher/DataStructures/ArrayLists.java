package Refresher.DataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList is a resizable/dynamic array.
        ArrayList<String> carsManufacturer = new ArrayList<>();
        carsManufacturer.add("Ford");
        carsManufacturer.add("Porsche");
        carsManufacturer.add("Mclaren");
        carsManufacturer.add("BMW");

        // We can print all the data inside the arrayList
        System.out.println("Cars Manufacturer: " + carsManufacturer);

        // `get` the item in the ArrayList
        System.out.println("====================================================");
        System.out.println("GET: " + carsManufacturer.get(0));
        try {
            System.out.println("GET: " + carsManufacturer.get(100));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("SAMPLE ERROR THROWED WHEN ACCESSING AN INDEX OUT OF BOUNDS/NOT EXISTING");
        }
        System.out.println("====================================================");
        System.out.println();

        // `set` an item in the ArrayList
        System.out.println("====================================================");
        carsManufacturer.set(0, "Toyota");
        System.out.println("GET AFTER SET: " + carsManufacturer.get(0));
        System.out.println("====================================================");
        System.out.println();

        // `remove` an item in the ArrayList
        System.out.println("====================================================");
        carsManufacturer.remove(0);
        System.out.println("GET AFTER REMOVE: " + carsManufacturer.get(0));
        System.out.println("====================================================");
        System.out.println();

        // `size` returns the length of the arraylist
        System.out.println("====================================================");
        System.out.println("SIZE: " + carsManufacturer.size());
        System.out.println("====================================================");
        System.out.println();


        // Loop through an arraylist using indexed for-loop
        for (int i = 0; i < carsManufacturer.size(); i++) {
            System.out.println("MANUFACTURER: " + carsManufacturer.get(i));
        }

        System.out.println();

        // Loop through an arraylist using advanced for-loop
        for (String manufacturer : carsManufacturer) {
            System.out.println("MANUFACTURER: " + manufacturer);
        }

        // `sort` an arraylist using `Collections.sort`
        System.out.println("====================================================");
        System.out.println("BEFORE SORT: " + carsManufacturer);
        Collections.sort(carsManufacturer);
        System.out.println("AFTER SORT: " + carsManufacturer);
        System.out.println("====================================================");
    }
}
