import java.util.Scanner;

public class IfJava {
    public static void main(String[] args){
    System.out.println("Enter a number to check whether it is positive or not! : ");
    Scanner sc = new Scanner(System.in);        
    int num = sc.nextInt();
    if (num < 0){
        System.out.println("Entered number is negative!!");
    }else{
        System.out.println("Entered number is positive!!");
    }
    }
}
