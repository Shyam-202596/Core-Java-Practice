public class GenericMethodDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Reading integer object: ");
        Myclass.display(arr1);
        Double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Reading Double object: ");
        Myclass.display(arr2);
        String[] arr3 = {"Shyama", "Roushan", "Vaibhav"};
        System.out.println("Reading String object: ");
        Myclass.display(arr3);
    }
}
class Myclass{ 
    static <T> void display(T[] arr){
        for(T i : arr){
            System.out.println(i);
        }
    }
}
