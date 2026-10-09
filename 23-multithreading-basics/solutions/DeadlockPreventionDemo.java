public class DeadlockPreventionDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Object train = new Object();
        Object compartment = new Object();
        BookTicket obj1 = new BookTicket(train, compartment);
        CancelTicket obj2 = new CancelTicket(train, compartment);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
class BookTicket extends Thread {
    Object train, comp;
    BookTicket(Object train, Object comp){
        this.train = train;
        this.comp = comp;
    }
    public void run() {
        synchronized(train){
            System.out.println("BookTicket locked on train");
            try{
                Thread.sleep(150);
            }catch(InterruptedException ie){}
            System.out.println("BookTicket now waiting to lock on Compartment...");
            synchronized(comp){
                System.out.println("BookTicket locked on Compartment");
            }
        }
    }
}
class CancelTicket extends Thread{
    Object train, comp;
    CancelTicket(Object train, Object comp){
        this.train = train;
        this.comp = comp;
    }
    public void run() {
        synchronized(train){
            System.out.println("CancelTicket locked on train");
            try{
                Thread.sleep(200);
            }catch(InterruptedException ie){}
            System.out.println("CancelTicket now waiting to lock on compartment...");
            synchronized(comp){
            System.out.println("CancelTicket locked on compartment");
            }
        }
    }
}
