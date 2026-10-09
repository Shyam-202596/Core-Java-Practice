public class SingleThreadMultipleTasksDemo {
    public static void main(String[] args) throws java.lang.Exception {
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start();// here we used single thread to execute the three tasks. 
    }
}
class MyThread implements Runnable{
    public void run(){
        task1();
        task2();
        task3();
    }
    void task1(){
        System.out.println("Task1 is completed");
    }
    void task2(){
        System.out.println("Task2 is completed");
    }
    void task3(){
        System.out.println("Task3 is completed");
    }
}
