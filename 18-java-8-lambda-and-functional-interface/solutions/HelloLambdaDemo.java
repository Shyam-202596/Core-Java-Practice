public class HelloLambdaDemo {
    interface MyInter{
        void message();
    }
    public static void main(String[] args) throws java.lang.Exception {
        MyInter mi = () -> {System.out.println("Hello, how are you?");};   
        mi.message();
    }
}
