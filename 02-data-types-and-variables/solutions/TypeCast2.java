//2. Let us make a program to override the super class show1() method in sub class. Now only the sub class method is executed.
public class TypeCast2{
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
    @Override
    void show1(){
        System.out.println("Sub class method");
    }
}