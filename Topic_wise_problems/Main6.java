public class Main6 {
    public static void main(String[] args) {
        Polymorphi animal = new Polymorphi();
        Cow cow = new Cow();
        Cat cat = new Cat();
        animal.Animal();
        cow.Animal();
        cat.Animal();
    }
}

class Polymorphi {
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

