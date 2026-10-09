import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer implements Runnable{
    static ServerSocket ss;
    static Socket s;
    public void run(){
        String name = Thread.currentThread().getName();
        for(;;){
            try{
                System.out.println("Thread " + name + " ready to accept");
                s = ss.accept();
                System.out.println("Thread " + name + " accepted a connection.");
                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.println("Thread " + name + " contacted you");
                ps.close();
                s.close(); // Don't close ServerSocket
            }catch(Exception e){}
        }
    }
    public static void main(String[] args) throws java.lang.Exception {
        MultiThreadedServer ms = new MultiThreadedServer();
        ss = new ServerSocket(8080);
        Thread t1 = new Thread(ms, "One");
        Thread t2 = new Thread(ms, "Two");
        t1.start();
        t2.start();
    }
}
