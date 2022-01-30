import java.util.ArrayList;
public class Lambda {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Aswin");
        names.add("Kannan");
        names.add("Sam");
        names.forEach( (n) -> {System.out.println(n);} ); //This is how lambda expression works!!!.
    }
}
