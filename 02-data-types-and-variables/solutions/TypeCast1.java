// 1. Write a program to see the widening effect where super class reference is used to refer to sub class object.
public class TypeCast1{
    public static void main(String[] args){
        One o; //here o is reference of class One, so the data type of o is One. 
        o = (One)new Two(); //convert class Two's type as class One
        o.show1();
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