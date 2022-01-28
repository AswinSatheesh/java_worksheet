import java.util.Scanner;
public class ScannerPrblms {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name;

        System.out.println("Enter the name: ");
        name = obj.nextLine();
        System.out.println("The entered name is : " + name);
    }
}
