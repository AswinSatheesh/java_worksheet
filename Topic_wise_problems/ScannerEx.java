import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String userName;
        userName = sc.nextLine();
        System.out.println("The Entered name is : "+ userName);
    }
}
