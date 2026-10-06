import java.util.stream.Stream;

public class RandomStreamDemo {
    public static void main(String[] args) throws java.lang.Exception {
        //create the stream from random numbers 
        Stream<Double> sm = Stream.generate(() -> {return Math.random();});
        sm.forEach(System.out :: println);
    }
}
