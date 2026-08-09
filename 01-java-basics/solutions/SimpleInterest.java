//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int time = sc.nextInt();
        float rate = sc.nextFloat();
        float ans = calculateSimpleInterest(principle, time, rate);
        System.out.println(ans);

        sc.close();
    }
    static float calculateSimpleInterest(int principle, int time, float rate){
        return (principle * time * rate) / 100;
    }
}
