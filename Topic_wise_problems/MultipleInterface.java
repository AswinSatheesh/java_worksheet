interface FirstInterface{
    public void cars();
}
interface SecondInterface{
    public void bikes();
}

class Democlass implements FirstInterface,SecondInterface{
    public void cars(){
        System.out.println("This is car section...");
    }
    public void bikes(){
        System.out.println("This is bike section...");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Democlass obj1 = new Democlass();
        obj1.cars();
        obj1.bikes();
    }
}
