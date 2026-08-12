//2. Let us make a proram where the abstract class Calculate has one abstract method which has got various implementations in sub classes. 
public class AbstractExample {
    public static void main(String[] args) {
        Sub1 obj1 = new Sub1();
        Sub2 obj2 = new Sub2();
        Sub3 obj3 = new Sub3();

        obj1.calculate(3);
        obj2.calculate(4);
        obj3.calculate(5);
    }
}
abstract class Calculate{
    abstract void calculate(double x);
}
class Sub1 extends Calculate{
    void calculate(double x){
        System.out.println("Square: " + (x*x));
    }
}
class Sub2 extends Calculate{
    void calculate(double x){
        System.out.println("Square root: " + Math.sqrt(x*x));
    }
}
class Sub3 extends Calculate{
    void calculate(double x){
        System.out.println("Cube: " + (x*x*x));
    }
}

