package collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_learn {
    public static void main(String[] args) {
        // -------------------------
        // ArrayList Declaration
        // -------------------------
        ArrayList<String> cars = new ArrayList<>();

        // -------------------------
        // Add Elements
        // -------------------------
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("FORD");
        cars.add("TATA");
        cars.add("Mazda");
        System.out.println(cars); // [Volvo, BMW, FORD, TATA, Mazda]

        // Add at specific index
        cars.add(1, "XUV");
        System.out.println(cars); // [Volvo, XUV, BMW, FORD, TATA, Mazda]

        // -------------------------
        // Access / Update / Remove
        // -------------------------
        System.out.println(cars.get(0)); // Volvo

        cars.set(0, "Opel");             // Change element
        System.out.println(cars);        // [Opel, XUV, BMW, FORD, TATA, Mazda]

        cars.remove(0);                  // Remove element
        System.out.println(cars);        // [XUV, BMW, FORD, TATA, Mazda]

        // -------------------------
        // ArrayList Size
        // -------------------------
        System.out.println("Size: " + cars.size());

        // -------------------------
        // Looping
        // -------------------------
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println("\nUsing for-each loop:");
        for (String car : cars) {
            System.out.println(car);
        }

        // -------------------------
        // Sorting
        // -------------------------
        Collections.sort(cars);
        System.out.println("\nAfter Sorting:");
        for (String car : cars) {
            System.out.println(car);
        }

        // -------------------------
        // Using List Interface
        // -------------------------
        List<String> carList = new ArrayList<>();
        carList.add("Honda");
        carList.add("Kia");
        System.out.println("\nList interface example: " + carList);
    }
}
