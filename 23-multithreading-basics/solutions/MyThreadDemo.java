public class MyThreadDemo {
    public static void main(String[] args) throws java.lang.Exception {
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start(); //to run the thread we use start() method of Thread class.
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i = 1; i <= 100; i++){
            System.out.println(i + " Love");
        }
    }
}
