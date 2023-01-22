import java.util.*;
public class WrapperString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: \n");
        Integer myInt = sc.nextInt();
        String myString = myInt.toString();
        System.out.println("Length :" + myString.length());
    }
}
