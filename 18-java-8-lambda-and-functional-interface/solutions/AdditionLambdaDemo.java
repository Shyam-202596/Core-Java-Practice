public class AdditionLambdaDemo {
    interface MyInter{
        void add(int a, int b);
    }
    public static void main(String[] args) throws java.lang.Exception {
        MyInter mi = (int a, int b) -> {System.out.println("Sum: " + (a + b));};   
        mi.add(11, 22);
    }
}
