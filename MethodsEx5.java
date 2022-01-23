public class MethodsEx5 {
    static int addTwoNumbers(int x , int y){
        return x + y;
    }
    static double addTwoNumbers(double x , double y){
        return x + y;
    }
    public static void main(String[] args){
        int Num1 = addTwoNumbers(10, 15);
        double Num2 = addTwoNumbers(5.3, 8.7);
        System.out.println("Integer Addition is  : "+ Num1);
        System.out.println("Double Addition is : " + Num2);
    }
}
