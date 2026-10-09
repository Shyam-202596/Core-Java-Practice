public class ThreadTerminationDemo {
    public static void main(String[] args) throws java.lang.Exception {
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start(); 
        System.in.read(); //wait till Enter key pressed.
        obj.stop = true;
    }
}
class MyThread extends Thread{
    boolean stop = false;
    public void run(){
        for(int i = 1; i <= 100000; i++){
            System.out.println(i + " Love");
            if(stop){
                return;
            }
        }
    }
}
