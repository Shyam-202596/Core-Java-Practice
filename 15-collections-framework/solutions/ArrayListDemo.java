import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) throws java.lang.Exception {
        ArrayList<String> arl = new ArrayList<>();
        arl.add("Apple");
        arl.add("Mango");
        arl.add("Banana");
        arl.add("Grapes");
        arl.add("Kiwi");
        System.out.println("Contents: "+ arl);
        arl.remove(3);
        arl.remove("Banana");
        System.out.println("Contents after removing: "+ arl);
        System.out.println("Size: " + arl.size());
        System.out.println("Extracting using iterator: ");
        Iterator<String> it = arl.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //it.remove(); //it will remove the coming element. and make arl empty
        }
        System.out.println(arl);
    }
}
