public class ThisClass {
    int a = 100, b = 200;
    ThisClass(int a, int b){
        a = this.a;
        b = this.b;
        System.out.println("a: "+a + " b: " +b);
    }
}
