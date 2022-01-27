public class SuperB extends SuperA {
   int a;
   void display(){
       System.out.println("It's SuperB");
       super.display();
   } 

   public static void main(String[] args) {
       SuperB obj = new SuperB();
       obj.display();
   }
}
