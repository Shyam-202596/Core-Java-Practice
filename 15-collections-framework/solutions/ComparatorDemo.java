import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Integer[] arr = {7, 12, 8, 17, 10};
        System.out.println("Original: " + Arrays.toString(arr));
        Arrays.sort(arr, new Ascend()); 
        System.out.println("Sorted in Ascending: " + Arrays.toString(arr));
        Arrays.sort(arr, new Descend());
        System.out.println("Sorted in Descending: " + Arrays.toString(arr));
    }
}
class Ascend implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2){
        return i1.compareTo(i2);
    }
} 
class Descend implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2){
        return i2.compareTo(i1);
    }
}
