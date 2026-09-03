//5. How to find if a number is the power of 2 in Java?

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        boolean ans = isPowerOfTwo(17); 
        System.out.println(ans);
	}
	static boolean isPowerOfTwo(int n){
	    return n > 0 && (n & (n - 1)) == 0;
	}
	static boolean isPowerOfTwo2(int n){
	    if(n <= 0){
	        return false;
	    }
	    while(n % 2 == 0){
	        n = n / 2;
	    }
	    return n == 1;
    }
}
