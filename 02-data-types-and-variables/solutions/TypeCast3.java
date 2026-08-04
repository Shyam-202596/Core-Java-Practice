// 3. Write a program for creating sub class reference which is used to refer to the super class object.
public class TypeCast3{
    public static void main(String[] args){
        Two t; //t is sub class reference, so the data type of t is Two.
        t = (Two)new One(); //convert class One's type as class Two
        t.show2(); //this will give runtime error because class One object is not compatible with class Two reference.
        t.show1(); //this will give runtime error because class One object is not compatible with class Two reference. 
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