//Take a number as input and print the multiplication table for it.
import java.util.*;

public class PrintTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	   
	   int num = sc.nextInt();
	   System.out.println("Table of " + num + " is: ");
	   
       printTable(num);

       sc.close();
    }
    static void printTable(int num){
	    for(int i = 1; i <= 10; i++){
	        System.out.println(num + " * " + i + " = " + (num * i)); 
	    }
	}
}
