//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printOddEven(input);
        sc.close();
    }
    static void printOddEven(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
