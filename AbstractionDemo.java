public class AbstractionDemo {
    public static void main(String[] args) {
       /* MaheshPhone obj = new MaheshPhone();  // Cannot create object for abstract class
          obj.call(); 
        */
        SureshPhone obj1 = new SureshPhone();
        obj1.call();
        obj1.move();
        obj1.dance();
        obj1.cook();
    }
}

abstract class MaheshPhone{ // if you have abstract methods then definitely  add abstract keyword in front of your class.
    public void call(){
        System.out.println("Calling...");
    }
    public abstract void move(); //abstract methods
    public abstract void dance();
    public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone{  // Any class which has abstract methods  will be called as abstrast
    public void move(){
        System.out.println("Moving...");
    }
}

class SureshPhone extends RameshPhone{  // Concrete class
    public void dance(){
        System.out.println("Dancing...");
    }
    
    public void cook(){
        System.out.println("Cooking...");
    }
}
