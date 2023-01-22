import java.util.Scanner;
public class AddTwoNum {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener a number :");
        num1 = sc.nextInt();

        System.out.println("Enter another number :");
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.println("The Result is :" + sum);
    }
}
