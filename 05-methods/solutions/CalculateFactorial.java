//10. Write a Java program to calculate the Factorial of an integer number? Both iterative and recursive solutions.

public class CalculateFactorial {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }
    //using recursive approach
    static int fact(int n){
        if(n < 0){
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        //base condition
        if(n == 1 || n == 0){
            return 1;
        }
        return n * fact(n - 1);
    }
    //using iterative approach
    static int fact2(int n){
        if(n < 0){
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        int ans = 1;
        while(n > 0){
            ans *= n;
            n = n - 1;
        }
        return ans;
    }
}
