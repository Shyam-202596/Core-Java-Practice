//3. Write a program in Java to find out if a number is prime in Java?
public class CheckPrime {
    public static void main(String[] args) {
        boolean ans = isPrime(9);
	    System.out.println(ans);
	}
	static boolean isPrime(int n){
	    if(n < 2){
	        return false;
	    }
	    for(int i = 2; i <= Math.sqrt(n); i++){
	        if(n % i == 0){
	            return false;
	        }
	    }
	    return true;
    }
}
