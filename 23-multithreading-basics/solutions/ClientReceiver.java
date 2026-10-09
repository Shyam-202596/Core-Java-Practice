import java.net.Socket;
import java.util.Scanner;

public class ClientReceiver {
    public static void main(String[] args) throws java.lang.Exception {
        Socket s = new Socket("localhost", 999); //here 999 is port number
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while(str != null){
            System.out.println(str);
        }
        sc.close();
        s.close();
    }
}
