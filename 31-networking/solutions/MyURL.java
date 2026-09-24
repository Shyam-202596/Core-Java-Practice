import java.net.URL;

public class MyURL {
    public static void main(String[] args) throws java.lang.Exception {
        URL obj = new URL("https://dreamtechpress.com/index.html");
        System.out.println("Protocol: " + obj.getProtocol()); //https
        System.out.println("Host: " + obj.getHost()); //dreamtechpress.com
        System.out.println("File: " + obj.getFile()); //'/index.html'
        System.out.println("Port: " + obj.getPort()); //-1
        System.out.println("Path: " + obj.getPath()); //'/index.html'
        System.out.println("External form: " + obj.toExternalForm()); //https://dreamtechpress.com/index.html
    }
}
