import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DisplayDetails {
    public static void main(String[] args) throws java.lang.Exception {
        URL obj = new URL("http://www.yahoo.com/index.html");
        URLConnection conn = obj.openConnection();
        System.out.println("Date: " + new Date(conn.getDate()));
        System.out.println("Content-type: " + conn.getContentType());
        System.out.println("Expiry: " + conn.getExpiration());
        System.out.println("Last Modified: " + new Date(conn.getLastModified()));
        int l = conn.getContentLength();
        System.out.println("Length of Content: " + l);
        if(l == 0){
            System.out.println("Content now available");
            return;
        }else{
            int ch;
            InputStream in = conn.getInputStream();
            //display the content of the index.html page.
            while((ch = in.read()) != -1){
                System.out.println((char)ch);
            }
        }
    }
}