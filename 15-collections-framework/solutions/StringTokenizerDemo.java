import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) throws java.lang.Exception {
        String str = "Shyam Vaibhav Roushan";
        String[] arr = str.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }
        String str2 = "He is a cricket player";
        StringTokenizer st = new StringTokenizer(str2, " ");
        System.out.println("Total tokens: "+ st.countTokens());
        System.out.println("Tokens are: ");
        while(st.hasMoreTokens()){
            String one = st.nextToken();
            System.out.println(one);
        }
    }
}
