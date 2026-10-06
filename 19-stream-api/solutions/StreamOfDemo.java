import java.util.stream.Stream;

public class StreamOfDemo {
    public static void main(String[] args) throws java.lang.Exception {
        //create a stream of Integer objects using Stream.of() method.
        Stream<Integer> sm1 = Stream.of(11, 12, 13, 14, 15);
        sm1.forEach(System.out :: println); //display the elements of Stream
        System.out.println("-------------------------------------");
        Float[] arr = {1.1f, 1.2f, 1.3f, 1.4f, 1.5f};
        Stream<Float> sm2 = Stream.of(arr);
        sm2.forEach(System.out :: println);
    }
}
