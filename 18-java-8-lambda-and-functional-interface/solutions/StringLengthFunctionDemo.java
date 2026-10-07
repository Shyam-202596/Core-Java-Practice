import java.util.function.Function;

public class StringLengthFunctionDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Function<String, Integer> len = (str) -> str.length();
        String str = "Dreamtech publictions";
        System.out.println("length : " + len.apply(str));
    }
}
