public class AnonymousThreadDemo {
    public static void main(String[] args) throws java.lang.Exception {
        // create thread object and pass the object of anonymous class.
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is from anonymous inner class");
            }
        });
        t.start();
    }
}
