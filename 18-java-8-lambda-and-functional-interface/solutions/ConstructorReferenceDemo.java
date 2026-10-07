public class ConstructorReferenceDemo {
    public static void main(String[] args) throws java.lang.Exception {
        MyInter mi = (String str) -> {return new Sample(str);};
        Sample s = mi.get("from lambda expression");
        MyInter mi1 = Sample :: new;
        Sample s1 = mi1.get("from double colon operator");
    }
}
 
class Sample{
    private String str;
    Sample(String str){
        this.str = str;
        System.out.println("constructor executed " + str);
    }
}
 
//functional interface
interface MyInter{
    Sample get(String str); // public abstract
}

