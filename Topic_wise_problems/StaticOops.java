public class StaticOops {
    static int a = 10; // if yo don't add static infront of int code will not run

    public static void main(String[] aswin){ // Here instead of args i have used my name aswin, There is np you can use whatever you want, its your wish.
        System.out.println(a); 
        function();
    }

    static void function(){
        System.out.println("It's printing bcz we added static in front of void");
    }
}
