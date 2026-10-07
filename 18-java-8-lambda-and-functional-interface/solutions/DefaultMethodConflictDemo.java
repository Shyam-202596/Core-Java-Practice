public class DefaultMethodConflictDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Implclass ic = new Implclass();
        ic.message();
    }
}
// Two interfaces with same default method name. 
interface One {
    default void message() {
        System.out.println("Hello from One");
    }
}
interface Two {
    default void message() {
        System.out.println("Hello from Two");
    }
}
class Implclass implements One, Two {
    // must override the method to avoid the confusion
    public void message(){
        Two.super.message();
    }
}
