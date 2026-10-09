public class TwoThreadsSingleObjectDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Reserve obj = new Reserve(1);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setName("First Person");
        t2.setName("Second Person");
        t1.start();
        t2.start();
    }
}
class Reserve implements Runnable{
    int available = 1;
    int wanted;
    Reserve(int i){
        wanted = i;
    }
    public void run(){
        System.out.println("available berth: " + available);
        if(available >= wanted){
            String name = Thread.currentThread().getName();
            System.out.println(wanted + " berths reserved for " + name);
            try{
                Thread.sleep(1500); //wait for printing the ticket.
                available -= wanted;
            }catch(InterruptedException ie){
                System.out.println("Exception occured");
            }
        }else{
            System.out.println("Sorry, no berths");
        }
    }
}
