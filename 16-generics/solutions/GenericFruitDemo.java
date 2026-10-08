public class GenericFruitDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Banana b = new Banana();
        AnyFruit<Banana> fruit1 = new AnyFruit<>();
        fruit1.tellTaste(b);
        Orange o = new Orange();
        AnyFruit<Orange> fruit2 = new AnyFruit<>();
        fruit2.tellTaste(o);
    }
}
// A generic interface.
interface Fruit<T>{
    void tellTaste(T fruit); // public abstract by default
}
class AnyFruit<T> implements Fruit<T>{
    public void tellTaste(T fruit){
        String fruitName = fruit.getClass().getName();
        if(fruitName.equals("Banana")){
            System.out.println("Banana is sweet.");
        }
        else if(fruitName.equals("Orange")){
            System.out.println("Orange is sour.");
        }
    }
}
class Banana{}
class Orange{}

