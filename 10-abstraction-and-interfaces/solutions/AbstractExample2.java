/*3. (Book) Write a program in which abstract class Car contains an instance variable, one concrete method
     and two abstract methods.
**/
public class AbstractExample2 {
    public static void main(String[] args) {
        Maruti m = new Maruti(1001);
        Santro s = new Santro(2002);

        Car ref;
        ref = m;
        ref.steering(1, 90);
        ref.braking(30);
        ref = s;
        ref.steering(2, 80);
        ref.braking(40);
    }
}
//This is an abstract class
abstract class Car{
    int regNo;

    Car(int r){
        regNo = r;
    }

    void openTank(){
        System.out.println("Fill the tank");
    }

    abstract void steering(int direction, int angle);

    abstract void braking(int force);
}
//Maruti is a concrete sub class derived from Car class 
class Maruti extends Car{

    Maruti(int regNo){
        super(regNo);
    }

    void steering(int direction, int angle){
        System.out.println("This is ordinary steering");
    }

    void braking(int force){
        System.out.println("These are hydroulic brakes");
    }
}
//Santro is a another concrete sub class derived from Car class 
class Santro extends Car{

    Santro(int regNo){
        super(regNo);
    }

    void steering(int direction, int angle){
        System.out.println("This is power steering");
    }

    void braking(int force){
        System.out.println("These are gas brakes");
    }
}
