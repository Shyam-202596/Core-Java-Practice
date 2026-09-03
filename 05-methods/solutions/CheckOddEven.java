//2. Write a program in Java to check if a number is even or odd in Java?
public class CheckOddEven {
    public static void main(String[] args) {
        boolean ans = isEven(3);
	    System.out.println(ans);
	}
	static boolean isEven(int n){
	    return (n & 1) == 0;
    }
}
