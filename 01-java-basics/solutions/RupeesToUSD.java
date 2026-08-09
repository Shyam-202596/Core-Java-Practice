//Input currency in rupees and output in USD.

import java.util.Scanner;

public class RupeesToUSD {
    static final double USD_RATE = 0.011;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter currency in rupees: ");
        double currency = sc.nextDouble();
 
        System.out.println(rupeesToUSD(currency));
        
        sc.close();
    }
    static double rupeesToUSD(double currency){
        return (USD_RATE * currency);
    }
}
