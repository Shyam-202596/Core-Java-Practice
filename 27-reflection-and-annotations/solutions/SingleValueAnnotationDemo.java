import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class SingleValueAnnotationDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Myclass obj = new Myclass();
        //getClass() method returns Class object and getMethod() returns the Method class object.
        Method m = obj.getClass().getMethod("myMethod");
        //now retrieve the single annotation associated with the method
        MySingle anno = m.getAnnotation(MySingle.class);
        System.out.println("Value: " + anno.value());
    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySingle{
    int value(); // This variable name must be value only
}
class Myclass{
    @MySingle(value = 100)
    void myMethod(){
        System.out.println("Hello");
    }
}
