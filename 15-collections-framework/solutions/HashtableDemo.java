import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Shyam", 11);
        ht.put("Vaibhav", 23);
        ht.put("Roushan", 18);

        System.out.println(ht);
        System.out.println(ht.get("Roushan"));//returns value of given key.
        System.out.println(ht.keySet());//returns only keys in Set form.
        System.out.println(ht.values());//returns only values.
        System.out.println(ht.remove("Vaibhav"));//will returns the value and remove "key = value" from HashMap.
        System.out.println(ht);
        System.out.println(ht.size());//returns numbers of key-value pairs.
        System.out.println("Retrive using Enumeration: ");
        Enumeration<String> e = ht.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
