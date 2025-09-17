package _18_Collections;

import java.util.Vector;

public class _03_vector {
    public static void main(String[] args) {
        // Creating a default Vector with initial capacity of 10
        Vector vec = new Vector();

        // Checking default capacity
        System.out.println(vec.capacity()); // Output: 10

        // Adding elements to the vector
        vec.add("Java");
        vec.add("Python");
        vec.add("C++");

        // Inserting "JavaScript" at index 1
        vec.add(1, "JavaScript");

        // Displaying all elements
        System.out.println("Initial Vector: " + vec);

        // Accessing element at index 2
        System.out.println("Element at index 2: " + vec.get(2));

        // Updating index 2 element to "Ruby"
        vec.set(2, "Ruby");
        System.out.println("After set(): " + vec);

        // Removing element at index 3
        vec.remove(3);
        System.out.println("After remove(index): " + vec);

        // Removing the object "Java"
        vec.remove("Java");
        System.out.println("After remove(value): " + vec);

        // Checking if "Python" exists in vector
        System.out.println("Contains Python? " + vec.contains("Python"));

        // Iterating through elements using for-each loop
        System.out.print("Using for-each: ");
        for (Object s : vec) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Getting total number of elements
        System.out.println("Size: " + vec.size());

        // Checking if vector is empty
        System.out.println("Is empty? " + vec.isEmpty());

        // Merging another collection into current vector
        Vector<String> newVec = new Vector<>();
        newVec.add("Go");
        newVec.add("Kotlin");
        vec.addAll(newVec);
        System.out.println("After addAll(): " + vec);

        // Clearing all elements
        vec.clear();
        System.out.println("After clear(): " + vec);

        System.out.println("---------------------------------------------------");

        // Creating a vector with initial capacity 10 and capacity increment 1
        Vector v = new Vector(10, 1);
        System.out.println(v.capacity()); // Output: 10

        // Filling vector to its initial capacity
        for (int i = 1; i <= 10; i++) {
            v.add(i);
        }
        System.out.println(v); // Prints elements from 1 to 10

        // Adding one more element — triggers capacity increase by 1
        v.add(11);
        System.out.println(v.capacity()); // Output: 11 (due to increment of 1)
        System.out.println(v); // Prints elements from 1 to 11
    }
}