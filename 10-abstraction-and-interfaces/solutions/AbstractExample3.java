/* 7.(Book) Let us make a program to write abstract class with an instance variable: rate, 
    a abstract method: getRate() and a concrete method: calculateBill().

**/
public class AbstractExample3 {
    public static void main(String[] args) {
        CommercialPlan cp = new CommercialPlan();
        DomesticPlan dp = new DomesticPlan();

        System.out.println("Commercial Connection: ");
        Plan p;
        p = cp;
        p.getRate();
        p.calculateBill(250);

        System.out.println("Domestic Connection");
        p = dp;
        p.getRate();
        p.calculateBill(150);
    }
}
abstract class Plan{
    protected double rate;

    public abstract void getRate();

    public void calculateBill(int units){
        System.out.println("Bill amount for "+ units + " units: ");
        System.out.println(rate * units);
    }
}
class CommercialPlan extends Plan{
    public void getRate(){
        rate = 5.00;
    }
}
class DomesticPlan extends Plan{
    public void getRate(){
        rate = 2.60;
    }
}