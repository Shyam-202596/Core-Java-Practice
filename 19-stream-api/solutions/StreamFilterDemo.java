import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterDemo {
    public static void main(String[] args) throws java.lang.Exception {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            lst.add(i);
        }
        Stream<Integer> sm = lst.stream();
        List<Integer> lst1 = sm.filter(i -> i > 5).collect(Collectors.toList());
        System.out.println(lst1);
    }
}
