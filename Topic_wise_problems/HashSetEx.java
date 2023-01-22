import java.util.HashSet;
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> cars =  new HashSet<String>();
        cars.add("Hundai");
        cars.add("Mahindra");
        cars.add("Toyota");
        System.out.println(cars);
        System.out.println(cars.contains("Toyota"));
    }
}
