import java.util.function.Predicate;

public class EvenNumberPredicateDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Integer[] arr = {8, 9, 10, 11, 12, 13, 14, 15};
        Predicate<Integer> all, evens;
        all = (n) -> true;
        evens = (n) -> n % 2 == 0;
        System.out.print("All Numbers: ");
        display(all, arr);
        System.out.print("Even Numbers: ");
        display(evens, arr);
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
