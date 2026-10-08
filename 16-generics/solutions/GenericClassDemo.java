public class GenericClassDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Integer i = 11;
        Myclass<Integer> obj1 = new Myclass<>(i);
        System.out.println("you stored: " + obj1.getobj());
        Float f = 11.11f;
        Myclass<Float> obj2 = new Myclass<>(f);
        System.out.println("you stored: " + obj2.getobj());
        String s = "Shyama";
        Myclass<String> obj3 = new Myclass<>(s);
        System.out.println("you stored: " + obj3.getobj());
    }
}
class Myclass<T>{ // here T is generic parameter which determines the datatype
    T obj; // declare T type object 
    Myclass(T obj){ // a constructor to initialize T type object 
        this.obj = obj;
    }
    T getobj(){
        return obj;
    }
}
