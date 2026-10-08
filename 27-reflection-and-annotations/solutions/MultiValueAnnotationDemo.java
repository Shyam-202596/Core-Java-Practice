import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MultiValueAnnotationDemo {
    public static void main(String[] args) throws java.lang.Exception {
       Class<Myclass> obj = (Class<Myclass>) Class.forName("Myclass");
       Annotation[] annot = obj.getAnnotations();
       for(Annotation x : annot){
           MyMulti a = (MyMulti) x;
           if(x instanceof MyMulti){
               System.out.println("value1: " + a.value1());
               System.out.println("value2: " + a.value2());
               System.out.println("value3: " + a.value3());
           }
       }
    }
}
 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyMulti{
    int value1(); 
    String value2();
    String value3();
}
 
@MyMulti(value1 = 11, value2 = "Shyama", value3 = "Tony")
class Myclass{
    void myMethod(){
        System.out.println("Hello");
    }
}
