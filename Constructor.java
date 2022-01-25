public class Constructor {
    Constructor(){ //Constructor name must be same as Class name!!
        System.out.println("While creating object this constructor will call automatically and print this text message!!");
    }

     public static void main(String[] args) {
        Constructor obj = new Constructor();  //Here actually while creating object , last part notice 'Constructor();', These is how its working

    }
}
