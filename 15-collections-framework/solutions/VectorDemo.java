import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Vector<Integer> v = new Vector<>(); // default capacity will be 10.
        int[] x = {80, 10, 40, 35, 20, 45, 15};
        for(int i = 0; i < x.length; i++){
            v.add(x[i]);
        }
        System.out.println("Elements: " + v);
        //retrieve the elements using get() method.
        System.out.println("Elements using get() method: ");
        for(int i = 0; i < v.size(); i++){
            System.out.print(v.get(i) + "\t");
        }
        System.out.println();
        //retrieve the elements using ListIterator in both the direction.
        System.out.println("Elements using ListIterator: ");
        ListIterator<Integer> lit = v.listIterator();
        System.out.println("In forward direction: ");
        while(lit.hasNext()){
            System.out.print(lit.next() + "\t");
        }
        System.out.println();
        System.out.println("In Backward direction: ");
        while(lit.hasPrevious()){
            System.out.print(lit.previous() + "\t");
        }
    }
}
