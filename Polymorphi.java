public class Polymorphi {
    public void Animal(){
        System.out.println("Animal make sound!!");
    }
}

class Cow extends Polymorphi{
    public void Animal(){
        System.out.println("Cow make maaaaa sound");
    }
}

class Cat extends Polymorphi{
    public void Animal(){
        System.out.println("Cat makes mywavooo sound");
    }
}

class Main{
    public static void main(String[] args) {
        Polymorphi obj = new Polymorphi();
        obj.Animal();
    }
}
