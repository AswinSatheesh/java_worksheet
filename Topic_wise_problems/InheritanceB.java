public class InheritanceB extends InheritanceA {
    InheritanceB(){
        System.out.println("It's B");
    }


    public static void main(String[] args) {
        InheritanceB obj = new InheritanceB();  //While creating object for Inhritance B , it will their parent class, if parent class is available then it print first. That's why 'its A ' printing first.
    }
}
