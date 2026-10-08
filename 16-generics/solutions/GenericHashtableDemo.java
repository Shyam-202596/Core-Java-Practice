import java.util.Hashtable;

public class GenericHashtableDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Dhoni", 91);
        ht.put("Kohli", 96);
        ht.put("Sachin", 99);
        String s = "Sachin";
        Integer score = ht.get(s);
        System.out.println("Score: " + score);
    }
}
