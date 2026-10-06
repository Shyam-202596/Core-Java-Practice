import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamToArrayDemo {
    public static void main(String[] args) throws java.lang.Exception {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            lst.add(i);
        }
        Stream<Integer> sm = lst.stream(); // to convert list into stream using stream() method.
        Integer[] arr = sm.filter(i -> i < 5).toArray(Integer[] :: new);
        //System.out.println(Arrays.toString(arr));
        for(Integer e : arr){
            System.out.println(e);
        }
    }
}
