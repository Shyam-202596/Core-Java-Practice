public class TwoThreadsTwoObjectsDemo {
    public static void main(String[] args) throws java.lang.Exception {
        MyThread obj1 = new MyThread("Cut the ticket");
        MyThread obj2 = new MyThread("Show the seat");
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
class MyThread implements Runnable{
    String str;
    MyThread(String str){
        this.str = str;
    }
    public void run(){
        for(int i = 1; i<= 10; i++){
            System.out.println(str + " : " + i);
            try{
                Thread.sleep(2000); //cease execution for 2000 milliseconds
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
