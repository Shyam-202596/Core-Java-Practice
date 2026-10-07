public class SquareRootLambdaDemo {
    interface MyInter{
        double squareRoot(double num);
    }
    public static void main(String[] args) throws java.lang.Exception {
       MyInter mi = (double num) -> {return Math.sqrt(num);};
       System.out.println("Square root of 256: " + mi.squareRoot(256));
    }
}
