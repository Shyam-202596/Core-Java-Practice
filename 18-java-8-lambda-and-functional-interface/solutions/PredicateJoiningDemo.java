import java.util.function.Predicate;

public class PredicateJoiningDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Integer[] arr = {8, 9, 10, 11, 12, 13, 14, 15, 16};
        Predicate<Integer> gt, lt;
        gt = (n) -> n > 10;
        lt = (n) -> n < 15;
        System.out.println("Numbers > 10 and < 15: ");
        display(gt.and(lt), arr); // we can use and(), or() and negate() methods to join Predicates
        System.out.println("Numbers <= 10 and >= 15");
        display(gt.and(lt).negate(), arr);
    }
    static void display(Predicate<Integer> p, Integer[] arr){
        for(Integer i : arr){
            if(p.test(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
