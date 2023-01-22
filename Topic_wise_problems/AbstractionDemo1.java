public class AbstractionDemo1 {
    public static void main(String[] args) {
        Realme3Pro obj = new Realme3Pro();
        RedmiMi4i obj1 = new RedmiMi4i();
        show(obj);
        show(obj1);
    }

    public static void show(Phone obj){
        obj.showConfig();
    }

abstract class Phone{
    public abstract  void showConfig();
}

class Realme3Pro extends Phone{
    public void showConfig(){
        System.out.println("4 Gb, Android 11");
    }
}
class RedmiMi4i extends Phone{
    public void showConfig(){
        System.out.println("3 Gb, Android 9");
    }
}
}
