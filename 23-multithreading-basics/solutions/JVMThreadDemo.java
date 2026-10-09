public class JVMThreadDemo {
      public static void main(String[] args) throws java.lang.Exception {
        System.out.println("Let's find the current thread: ");
        Thread t = Thread.currentThread(); //gives Object of Thread class.
        System.out.println("Current Thread: "+ t);
        System.out.println("It's name: "+ t.getName());//gives Thread name.
    }
}
