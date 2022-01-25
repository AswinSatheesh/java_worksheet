public class StaticOops {
    static int a = 10;

    public static void main(String[] aswin){
        System.out.println(a);
        function();
    }

    static void function(){
        System.out.println("It's printing bcz we added static in front of void");
    }
}
