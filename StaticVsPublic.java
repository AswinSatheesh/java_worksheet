public class StaticVsPublic {
    static void addNumbers(){
        int a = 10;
        int b = 30;
        int c = a + b;
        System.out.println(c + "  We can print this result without creating object. Because it is  'static'");
    }

    public void subsNumbers(){
        int d = 6;
        int e = 4;
        int f = d + e;
        System.out.println(f + " we can print this result only with the help of creating objects. because it is 'public' ");
    }

    public static void main(String[] args){
        addNumbers(); // calling static without creating objects
        
        StaticVsPublic obj = new StaticVsPublic();
        obj.subsNumbers();
    }
}
