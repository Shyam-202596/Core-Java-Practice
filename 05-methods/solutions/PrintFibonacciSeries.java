//9. Write a program in Java to print the Fibonacci series up to a given number? Write both iterative and recursive versions.

public class PrintFibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
		for(int i = 0; i < n; i++){
		    System.out.print(fibo1(i) + " ");
		}
		fibo2(10);
	}
	//using recursion
	static int fibo1(int n){
	    if(n <= 1){
	        return n;
	    }
	    return fibo1(n-1) + fibo1(n-2);
	}
    //using iteration
	static void fibo2(int n){
	    System.out.println();
	    int f = 0;
        int s = 1;
	    for(int i = 0; i < n; i++){
	        if(i == 0){
	            System.out.print(0 + " ");
	        }
	        if(i == 1){
	            System.out.print(1 + " ");
	        }
	        if(i > 1){
	            int temp = s;
    	        s = f + s;
    	        f = temp;
	            System.out.print( s + " ");
	        }
	    }
	}
    static void fibo3(int n) {
	    System.out.println();
        int f = 0, s = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(f + " ");
            int next = f + s;
            f = s;
            s = next;
        }
    }
}
