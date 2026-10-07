import java.util.function.Predicate;

public class NumberPredicateDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Predicate<Integer> gt = (i) -> i > 10;
        boolean res = gt.test(11);
        System.out.println("Greater than 10: " + res);
    }
}
