import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) throws java.lang.Exception {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Shyam");
        hm.put(2, "Vaibhav");
        hm.put(3, "Roushan");
        hm.put(4, "Roushan");
        System.out.println(hm);
        System.out.println(hm.get(3));//returns value of given key.
        System.out.println(hm.keySet());//returns only keys in Set form.
        System.out.println(hm.values());//returns only values.
        System.out.println(hm.remove(3));//will returns the value and remove "key = value" from HashMap.
        System.out.println(hm);
        System.out.println(hm.size());//returns numbers of key-value pairs.
    }
}
