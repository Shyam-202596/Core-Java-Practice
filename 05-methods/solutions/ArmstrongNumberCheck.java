//7. Write a Java program to check if a number is Armstrong's number or not?

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        boolean ans = isArmstrong(153);
	    System.out.println(ans);
	}
	static boolean isArmstrong(int n){
	    return n == cubeSum(n);
	}
	static int cubeSum(int n){
	    int sum = 0;
	    while(n > 0){
	        int rem = n % 10;
	        sum = sum + (int)Math.pow(rem, 3);
	        n = n / 10;
	    }
	    return sum;
    }
}
