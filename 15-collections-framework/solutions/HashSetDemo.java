import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("India");
        hs.add("USA");
        hs.add("Japan");
        hs.add("China");
        hs.add("Russia");
        hs.add("India");
        System.out.println("Contents: "+ hs);
        hs.remove("USA");
        System.out.println("Contents after removing: "+ hs);
        System.out.println("Size: " + hs.size());
 
        System.out.println("Extracting using iterator: ");
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //it.remove(); //it will remove the coming element. and make arl empty
        }
        System.out.println("after iteration: " + hs);
    }
}
