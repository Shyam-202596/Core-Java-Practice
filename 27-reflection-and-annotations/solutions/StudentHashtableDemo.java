import java.util.Hashtable;

public class StudentHashtableDemo {
    @SuppressWarnings("unchecked") //use to suppress warnings issued by Compiler, can be applied to a class, method, or interface.
    public static void main(String[] args) throws java.lang.Exception {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(10, "Rani");
        ht.put(11, "Sona");
 
        System.out.println(ht);
    }
}
