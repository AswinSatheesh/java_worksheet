import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();  //syntax
        cars.add("Maruthi");
        cars.add("Vista");
        cars.add("i20");
        cars.add("Innova");
        cars.add("Jeep");
        // System.out.println(cars);
        System.out.println(cars.get(0)); //This is how we access an element in ArrayList using 'get()' method.
        cars.set(2, "Tata Harrier"); // Change an item
        cars.remove(1);
        // cars.clear(); //To clear all elements from the ArrayList.
        System.out.println(cars.size()); // To find out the size of the ArrayList.
    }
}
