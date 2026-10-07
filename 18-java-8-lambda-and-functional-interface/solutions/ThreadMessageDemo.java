public class ThreadMessageDemo implements Runnable {
    public void run(){
        System.out.println("This is from thread");    
    }
    public static void main(String[] args) throws java.lang.Exception {
        ThreadMessageDemo obj = new ThreadMessageDemo();
        Thread t = new Thread(obj);
        t.start(); 
    }
}
