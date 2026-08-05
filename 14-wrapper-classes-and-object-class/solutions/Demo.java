//6. Write a program where an object is passed to printName() method and the class name of the object is displayed by the method. 
public class Demo{
	public static void main(String[] args){
		//create Myclass object obj 
		Myclass obj = new Myclass(11);
		//know the class name of the object obj by calling printName().
		KnowName.printName(obj);
	}
}

//Using getClass() to know the classname 
//Myclass stores an int value
class Myclass{
	int x;
		
	Myclass(int x){
		this.x = x; 
	}
}

//This class contains method to receive an object and display the classname 
class KnowName{
	static void printName(Object obj){
		//get the class name into an object c of the class Class.
		Class c = obj.getClass();
		//get the name of the class using getName()
		String name = c.getName();
		System.out.println("The class name = "+ name);
	}
}