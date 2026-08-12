//Abstract Class: Book
//1. Write a program where SquareClass's calculate() method is available to all the objects and hence every object can calculate the square value.
class Square{
    void calculate(double x){
        System.out.println("Square: " + (x*x));
    }
}
public class SquareClass{
    public static void main(String[] args) {
        Square obj1 = new Square();
        Square obj2 = new Square();
        Square obj3 = new Square();

        obj1.calculate(3);
        obj2.calculate(4);
        obj3.calculate(5);
    }
}
