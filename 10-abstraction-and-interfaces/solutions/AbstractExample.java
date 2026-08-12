//2. Let us make a proram where the abstract class Calculate has one abstract method which has got various implementations in sub classes. 
public class AbstractExample {
    public static void main(String[] args) {
        Sub1 obj1 = new Sub1();
        Sub2 obj2 = new Sub2();
        Sub3 obj3 = new Sub3();

        obj1.calculate(3);
        obj2.calculate(4);
        obj3.calculate(5);

        Calculate ref; // ref is reference of Calculate 
        ref = obj1;   // ref is refering to obj1
        ref.calculate(6); // call obj1's claculate() method
        ref = obj2;
        ref.calculate(16);
        ref = obj3;
        ref.calculate(3);
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
        System.out.println("Square root: " + Math.sqrt(x));
    }
}
class Sub3 extends Calculate{
    void calculate(double x){
        System.out.println("Cube: " + (x*x*x));
    }
}

