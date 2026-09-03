//11. Print following structure in Java?

public class PrintPattern {
    public static void main(String[] args) {
        pattern(3);
    }
    static void pattern(int n){
        for(int row = 0; row < 2*n - 1; row++){
            int starts = row < n ? 2*row + 1 : 2 * (2 * n - row - 1) - 1;
            for(int col = 0; col < starts; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
