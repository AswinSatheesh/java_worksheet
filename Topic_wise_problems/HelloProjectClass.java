public class HelloProjectClass {
    int a, b, c;
    
    void addNumbers(){
        c = a + b;
    }

    void getResult(){
        addNumbers();
        System.out.println(c);
    }
}
