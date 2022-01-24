public class AcMethodsEx {
    public void fullThrottle(){
        System.out.println("The car is going fast as it can!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is :" + maxSpeed);
    }

    public static void main(String[] args){
        AcMethodsEx mycar = new AcMethodsEx();
        mycar.fullThrottle();
        mycar.speed(200);
    }
}
