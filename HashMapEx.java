import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<String, String>(); //syntax for creating a Hash Map
        names.put("Aswin", "9946322046");
        names.put("Kannan", "92074558");
        names.put("Veliyannoor", "Kottayam");
        names.put("Coimbatore", "Tamilnadu");
        
        System.out.println(names.get("Aswin"));  // This is how using 'get()' method have to  specify the key and we will get the value as output while printing.
        names.remove("Coimbatore"); //This is how we are remove some perticular key value pair from the HashMap
        names.clear(); //Used to clear all the elements from the HashMap
        System.out.println(names.size()); //used to find te size

        for( String i : names.keySet()){ // keyset() wil only print the 'keys' in the Hash Map
            System.out.println(i);
        }

        for( String j : names.values()){ // values() will only print the 'values ' in the HashMap
            System.out.println(j);
        }
    }
}
