public class HelloProject {
    public static void main(String[] args){
        HelloProjectClass s1 = new HelloProjectClass();
        HelloProjectClass s2 = new HelloProjectClass();

        s1.a = 10;
        s1.b = 20;
        s2.a = 40;
        s2.b = 10;

        // s1.addNumbers();
        // s2.addNumbers();

        s1.getResult();
        s2.getResult();
    }
}
