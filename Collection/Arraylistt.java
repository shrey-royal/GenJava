import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistt {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();

        cars.add("Volvo XC90");
        cars.add("BMW X5");
        cars.add("Ford Mustang");
        cars.add("Audi A8");
        cars.add("Koenigsegg Agera R");

        System.out.println(cars);

        // cars.add(2, "Lamborghini Veneno");
        // System.out.println(cars);

        // cars.add(System.console().readLine("Enter a car name: "));
        // System.out.println(cars);

        //Iterating ArrayList
        // for (String i : cars) {
        //     System.out.println(i);
        // }

        // Iterator<String> i = cars.iterator();
        // while(i.hasNext()) {
        //     System.out.println(i.next());
        // }

        // System.out.println("Size: " + cars.size());
        // System.out.println("Get: " + cars.get(2));
        // System.out.println("Index of: " + cars.indexOf("Ford Mustang"));
        // System.out.println("Set: " + cars.set(4, "Alto k10"));
        // System.out.println("Remove: " + cars.remove(4));
        // System.out.println(cars);
        // System.out.println("Remove: " + cars.remove("Ford Mustang"));
        // System.out.println(cars);

        // cars.clear();
        // System.out.println(cars);

    }
}

/*
Methods of List
The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.

Some of the commonly used methods of the Collection interface that's also available in the List interface are:

add() - adds an element to a list
addAll() - adds all elements of one list to another
get() - helps to randomly access elements from lists
iterator() - returns iterator object that can be used to sequentially access elements of lists
set() - changes elements of lists
remove() - removes an element from the list
removeAll() - removes all the elements from the list
clear() - removes all the elements from the list (more efficient than removeAll())
size() - returns the length of lists
toArray() - converts a list into an array
contains() - returns true if a list contains specified element


*/