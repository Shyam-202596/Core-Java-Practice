public class VariableAccessLambdaDemo {
    int x = 11;
 
    void method() {
        int x = 22;
 
        Runnable r = () -> {
            System.out.println("class variable: " + this.x);
            System.out.println("method variable: " + x);
        };
        Thread t = new Thread(r);
        t.start();
    }
 
    public static void main(String[] args) throws java.lang.Exception {
        VariableAccessLambdaDemo obj = new VariableAccessLambdaDemo();
        obj.method();
    }
}
