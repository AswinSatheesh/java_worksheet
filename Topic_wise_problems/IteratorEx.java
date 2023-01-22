import java.util.ArrayList;
import java.util.Iterator;
public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> it = new ArrayList<String>(); 
        it.add("Names");
        it.add("Place");
        it.add("Location");
        it.add("Job");
        Iterator<String> itr = it.iterator();
        // System.out.println(itr.next());

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
