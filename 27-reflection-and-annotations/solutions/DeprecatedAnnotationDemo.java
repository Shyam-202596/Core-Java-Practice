public class DeprecatedAnnotationDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Myclass obj = new Myclass();
        obj.myMethod();
    }
}
class Myclass{
    @Deprecated
    void myMethod(){
        System.out.println("This method is deprecated.");
    }
}
