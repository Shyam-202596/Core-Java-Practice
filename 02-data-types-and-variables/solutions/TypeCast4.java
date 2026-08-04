//4. Write a program for creating super class reference to refer to the sub class object.
public class TypeCast4{
    public static void main(String[] args){
        One o; //here o is reference of class One, so the data type of o is One. 
        o = new Two(); 
        Two t = (Two)o; //this is called narrowing where super class reference is converted to sub class reference.
        t.show1();
        t.show2();
    }
}

class One{
    void show1(){
        System.out.println("Super class method");
    }
} 

class Two extends One{
    void show2(){
        System.out.println("Sub class method");
    }
}