public class LambdaThreadDemo {
    public static void main(String[] args) throws java.lang.Exception {
        // create thread object and pass lambda expression (to implement run() method).
        Thread t = new Thread(() -> {System.out.println("This is from lambda expression");});
        t.start();
    }
}
