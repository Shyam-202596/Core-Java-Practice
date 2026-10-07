public class MethodReferenceDemo {
    static void display() {
        System.out.println("Hello from display");
    }
    public static void main(String[] args) throws java.lang.Exception {
        Runnable r1 = () -> System.out.println("Hello from lambda");
        r1.run(); // start() belongs to Thread class not Runnable interface so use run() method.
        Runnable r2 = MethodReferenceDemo :: display;
        r2.run();
    }
}
