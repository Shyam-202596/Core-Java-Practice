import java.util.Arrays;

public class EnumConstructorDemo {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("Available Icecreams: ");
        for(Icecream ice : Icecream.values()){
            //ordinal() method starts counting from 0
            int no = ice.ordinal();
            System.out.println(no + " " + ice);
        }
        Icecream.getPrice(0);
    }
}
enum Icecream{
    Vanilla(20.00), Chocolate(22.50), Strawberry(23.00), Raspberry(25.00);
    private double price;
    Icecream(double p){
        price = p;
    }
    static void getPrice(int i){
        Icecream[] allIcecreams = Icecream.values();
        System.out.println(Arrays.toString(allIcecreams));
        System.out.println("Pay Rs." + allIcecreams[i].price);
    }
}
