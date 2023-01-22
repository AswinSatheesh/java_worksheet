public class MethodsEx4 {
    static void marks(int mark){
        if (mark > 50){
            System.out.println("Congratulations!!! You have cleared the exam with good marks!");
        }else{
            System.out.println("Sorry!! You have to attend the exam once again . Better luck next time.");
        }
    }
    public static void main(String[] args){
        marks(60);
        // marks(48);
    }
}
