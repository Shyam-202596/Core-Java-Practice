import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPAddress {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a website name: ");
        String site = sc.nextLine();
        try{
            InetAddress ip = InetAddress.getByName(site);
            System.out.println("IP Address: " + ip);
        }catch(UnknownHostException ue){
            System.out.println("Website not found");
        }
    }
}
