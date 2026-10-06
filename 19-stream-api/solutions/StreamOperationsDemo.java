import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsDemo {
    public static void main(String[] args) throws java.lang.Exception {
        //take a string type array and convert into a list.
        List<String> lst = Arrays.asList("USA", "India", "Japan", "Russia", "China", "", "UK");
        //count number of strings with length more than 4 Characters.
        long n = lst.stream().filter((s) -> s.length() > 4).count();
        System.out.println("Number of Strings with more than 4 Characters: " + n);
        //count number of Strings which starts with "U".
        n = lst.stream().filter((s) -> s.startsWith("U")).count();
        System.out.println("Number of Strings that starts with U: " + n);
        //remove all the empty strings from the list and collect them into another list.
        List<String> lst1 = lst.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("List after removing the empty lists: " + lst1);
        //sort the stream and then convert into upper case and then collect into another list.
        List<String> lst2 = lst1.stream().sorted().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("List after sorting in upper case: " + lst2);
        //convert all strings to capital letters and collect them into an array.
        String[] arr = lst1.stream().sorted().map(s -> s.toUpperCase()).toArray(String[] :: new);
        System.out.println("Arrays of sorted strings in uppercase: " + Arrays.toString(arr));
    }
}
