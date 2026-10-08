public class OverrideAnnotationDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Two t = new Two();
        t.doSomething();
    }
}
class One{
    void doSomething(){
        System.out.println("Super class, Hii");
    }
}
class Two extends One{
    @Override //if overriding must use it to avoid typo error in method name.
    void doSomething(){
        System.out.println("Sub class, Hello");
    }
}
