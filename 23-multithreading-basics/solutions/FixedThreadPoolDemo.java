import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
    public static void main(String[] args) throws java.lang.Exception {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Tasks[] t = new Tasks[4];
        for(int i = 0; i < 4; i++){
            t[i] = new Tasks(i);
            es.execute(t[i]);
        }
        es.shutdown();
    }
}
class Tasks implements Runnable{
    private int taskno;
    Tasks(int taskno){
        this.taskno = taskno;
    }
    public void run(){
        for(int i = 0; i <= 100; i++){
            String name = Thread.currentThread().getName();
            System.out.println(name + " completed task " + taskno + " by " + i + " percent.");
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
    }
}
