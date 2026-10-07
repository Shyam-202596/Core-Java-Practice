public class DefaultMethodDemo {
    public static void main(String[] args) throws java.lang.Exception {
        MyInter mi = new ImpleMyInter();
        System.out.println("sum: " + mi.add(10, 25));
        System.out.println("Product: " + mi.mul(10, 25));
    }
}
 
interface MyInter{
    int add(int x, int y); // public abstract 
    default int mul(int x, int y){ //this is default method
        return x*y;
    }
}
class ImpleMyInter implements MyInter{
    public int add(int x, int y){
        return x + y;
    }
}
