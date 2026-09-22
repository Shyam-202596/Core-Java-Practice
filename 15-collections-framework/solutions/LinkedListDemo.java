import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) throws java.lang.Exception {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Apple");
        ll.add("Mango");
        ll.add("Banana");
        ll.add("Grapes");
        ll.add("Kiwi");
        System.out.println("Contents: "+ ll);
        ll.remove(3);
        ll.remove("Banana");
        System.out.println("Contents after removing: "+ ll);
        System.out.println("Size: " + ll.size());
        System.out.println("Extracting using iterator: ");
        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //it.remove(); //it will remove the coming element. and make arl empty
        }
        System.out.println(ll);
    }
}
