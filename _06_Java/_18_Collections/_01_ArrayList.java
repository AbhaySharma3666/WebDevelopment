package _18_Collections;

import java.util.ArrayList;
import java.util.Collections; // For sorting
import java.util.ListIterator;

public class _01_ArrayList {

    public static void main(String[] args) {

        // 1. Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("Initial ArrayList: " + fruits);

        // 2. add(E e): Adds an element to the end of the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("After adding elements: " + fruits);

        // 3. add(int index, E element): Adds an element at a specific index
        fruits.add(1, "Grape");
        System.out.println("After adding at index 1: " + fruits);

        // 4. get(int index): Returns the element at the specified position
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // 5. set(int index, E element): Replaces the element at the specified position
        fruits.set(2, "Mango");
        System.out.println("After setting element at index 2: " + fruits);

        // 6. remove(Object o): Removes the first occurrence of the specified element
        fruits.remove("Grape");
        System.out.println("After removing 'Grape': " + fruits);

        // 7. remove(int index): Removes the element at the specified position
        fruits.remove(0);
        System.out.println("After removing element at index 0: " + fruits);

        // 8. size(): Returns the number of elements in the list
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // 9. contains(Object o): Returns true if this list contains the specified element
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Does ArrayList contain 'Banana'? " + hasBanana);

        // 10. indexOf(Object o): Returns the index of the first occurrence of the specified element
        int mangoIndex = fruits.indexOf("Mango");
        System.out.println("Index of 'Mango': " + mangoIndex);

        // 11. addAll(Collection<? extends E> c): Appends all elements from a collection
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Pineapple");
        moreFruits.add("Strawberry");
        fruits.addAll(moreFruits);
        System.out.println("After adding all from another list: " + fruits);

        // 12. clear(): Removes all elements from the list
        // fruits.clear();
        // System.out.println("After clearing the ArrayList: " + fruits);

        // 13. isEmpty(): Returns true if this list contains no elements
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);

        // 14. clone(): Returns a shallow copy of this ArrayList instance
        ArrayList<String> clonedFruits = (ArrayList<String>) fruits.clone();
        System.out.println("Cloned ArrayList: " + clonedFruits);

        // 15. sort(Comparator<? super E> c): Sorts the ArrayList (requires Java 8+)
        Collections.sort(fruits);
        System.out.println("After sorting: " + fruits);

        // 16. toArray(): Returns an array containing all elements in proper sequence
        Object[] fruitArray = fruits.toArray();
        System.out.println("Elements in array form:");
        for (Object fruit : fruitArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 17. trimToSize(): Trims the capacity of this ArrayList instance to be the list's current size.
        fruits.trimToSize();
        System.out.println("After trimToSize (no visual change, affects underlying capacity)");

        ArrayList ramdom = new ArrayList();
        ramdom.add(3);
        ramdom.add("java");
        ramdom.add(null);
        ramdom.add(24);
        ramdom.add("Apple");

//        Iterator itr = ramdom.iterator();
        ListIterator itr1 = ramdom.listIterator();
        System.out.println("Print through Iterator");
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("====================");
        System.out.println("print reverse");
        while(itr1.hasPrevious()){
            System.out.println(itr1.previous());
        }
    }
}