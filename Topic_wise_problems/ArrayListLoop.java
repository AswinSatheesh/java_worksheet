import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Aswin");
        names.add("Kannan");
        names.add("Kuttu");
        names.add("Vava");
        names.add("Teju");
        // System.out.println(names);
      /*  for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));   // This is how for loop works
        }  */

        Collections.sort(names);  // With the help of 'collections' class we can sort(alphabetically and numerically) the ArrayList elements

        for (String i : names){
            System.out.println(i);  //This is how for each loop works!!
        }
    }
}
