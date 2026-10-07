public class RunnableImplementationDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Thread t = new Thread(new Implclass());
        t.start(); 
    }
}
 
class Implclass implements Runnable{
    public void run(){
        System.out.println("This is from implementation class");    
    }
}
