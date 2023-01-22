import java.util.Scanner;

public class InputJava {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Two numbers are "+ a + " and "+ b);
        int result = a + b;
        System.out.println("The Sum of the two numbers are : " +result);
    }
}
