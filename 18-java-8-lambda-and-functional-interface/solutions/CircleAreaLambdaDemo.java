public class CircleAreaLambdaDemo {
    //funtional interface
    interface Circle{
        void calculate(double radius);
    }
    void circleArea(double radius, Circle ref){
        ref.calculate(radius);
    }
    public static void main(String[] args) throws java.lang.Exception {
        CircleAreaLambdaDemo obj = new CircleAreaLambdaDemo();
        Circle ref = (r) -> {System.out.println("Area: " + Math.PI * r * r);};
        obj.circleArea(20, ref);
    }
}
