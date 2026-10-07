import java.util.function.Predicate;

public class PredicateMethodDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Integer[] arr = {8, 9, 10, 11, 12, 13, 14, 15};
        Predicate<Integer> gt = (i) -> i > 10;
        System.out.println("Numbers greater than 10: ");
        myMethod(gt, arr);
    }
    static void myMethod(Predicate<Integer> p, Integer[] arr){
        for(Integer i : arr){
            if(p.test(i)){
                System.out.print(i + " ");
            }
        }
    }
}
