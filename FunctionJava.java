import java.util.Scanner;

public class FunctionJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result ;
        result = sum(num1,num2);
        System.out.println("Result is :"+ result);
    }

    static int sum(int a , int b){
        int c = a + b;
        return c ;
    }
}
