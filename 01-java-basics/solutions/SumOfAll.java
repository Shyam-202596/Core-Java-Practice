//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	    int sum = 0;
	    while(true){
	        System.out.println("Enter a number or x to stop.");
	        String input = sc.next();
	        if(input.equals("x")){
	            break;
	        }
	        int num = Integer.parseInt(input);
	        sum = sum + num;
	    }
	    System.out.println(sum);

        sc.close();
    }
}
