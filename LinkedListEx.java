import java.util.LinkedList;
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> bikes = new LinkedList<String>();
        bikes.add("MT15");
        bikes.add("FZ");
        bikes.add("Duke");
        // System.out.println(bikes);
        bikes.addFirst("Ducati"); // add items to the first.
        bikes.addLast("Splender");
        bikes.removeFirst();
        System.out.println(bikes.getFirst());
    }
}
