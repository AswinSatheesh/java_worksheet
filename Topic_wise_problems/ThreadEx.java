public class ThreadEx extends Thread {
    public static void main(String[] args) {
        ThreadEx obj = new ThreadEx();
        obj.start();
        System.out.println("This code is outside of the thread.");
    }
    public void run(){
        System.out.println("This code is running in a thread!!!");
    }
}
