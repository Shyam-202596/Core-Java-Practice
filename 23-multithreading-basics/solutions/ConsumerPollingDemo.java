public class ConsumerPollingDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Producer obj1 = new Producer();
        Consumer obj2 = new Consumer(obj1);
 
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
 
        t2.start(); // Consumer waits
        t1.start(); // Producer starts production
    }
}
class Producer extends Thread {
    StringBuffer sb;
 
    //boolean dataprodover = false;
 
    Producer() {
        sb = new StringBuffer(); //allot memory.
    }
 
    public void run() {
        synchronized(sb) {
            for (int i = 1; i <= 10; i++) {
                try {
                    sb.append(i + ":");
                    Thread.sleep(100);
                    System.out.println("appending...");
                } catch (Exception e) {}
            }
            //dataprodover = true;
            sb.notify();
        }
    }
}
class Consumer extends Thread {
    Producer prod;
 
    Consumer(Producer prod) {
        this.prod = prod;
    }
 
    public void run() {
        synchronized(prod.sb) {
            try {
                //while(!prod.dataprodover){
                //    Thread.sleep(10);
                //}
                prod.sb.wait();
            } catch (Exception e) {}
        }
        System.out.println(prod.sb);
    }
}
