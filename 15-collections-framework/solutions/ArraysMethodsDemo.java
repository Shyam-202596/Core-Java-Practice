import java.util.Arrays;

public class ArraysMethodsDemo {
    public static void main(String[] args) throws java.lang.Exception {
        int[] arr = {7, 12, 8, 17, 10};
        System.out.println("Original: " + Arrays.toString(arr));
        Arrays.sort(arr); //Arrays class built-in method to sort the array.
        System.out.println("Sorted: " + Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 12);//Arrays class built-in method to search the element in the array. 
        System.out.println("Searching: " + index);
        Arrays.fill(arr, 11);
        System.out.println("filled: " + Arrays.toString(arr));
    }
}
