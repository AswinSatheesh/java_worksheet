interface Animal{
    public void animalSound();
    public void sleep();
}

class Pig implements Animal{
    public void animalSound(){
        System.out.println("Pig says: weee weee...");
    }
    public void sleep(){
        System.out.println("Zzz...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Pig obj = new Pig();
        obj.animalSound();
        obj.sleep();
    }
}
