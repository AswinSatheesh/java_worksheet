import OuterClass.InnerClass;

public class MainClass{
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        obj1.myfun();
        OuterClass.InnerClass obj2 = obj1.new InnerClass();
        obj2.fun();
    }
}


class OuterClass {
    void myfun(){
        System.out.println("This is outerclass...");
    }

    class InnerClass{
        void fun(){
            System.out.println("This is innerclass...");
        }
    }
}


