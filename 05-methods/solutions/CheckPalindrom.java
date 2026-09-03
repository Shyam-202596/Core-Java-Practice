//4. Write a Java program to check if a number is a palindrome in Java?
public class CheckPalindrom {
    public static void main(String[] args) {
        boolean ans = isPalindrom(121);
	    System.out.println(ans);
	}
	static boolean isPalindrom(int n){
	    return n == reverse2(n);
	}
	static int reverse(int n){
	    int rev = 0;
	    while(n > 0){
	        int rem = n % 10;
	        rev = rev * 10 + rem;
	        n = n / 10;
	    }
	    return rev;
	}
	//using recursion
	static int reverse2(int n){
	    if(n % 10 == n){
	        return n;
	    }
	    int rem = n % 10;
	    int dig = (int)Math.log10(n);
	    return rem * (int)Math.pow(10, dig) + reverse2(n / 10);
    }
}
