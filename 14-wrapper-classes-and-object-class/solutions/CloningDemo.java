//7. Write a program to make cloning Employee class object by writing our own myClone() method, from where Object class clone() method is called.

//Cloning example
public class CloningDemo{
	public static void main(String[] args) throws CloneNotSupportedException{
		
		//create Employee class object using new operator
		Employee e1 = new Employee(11, "Shyama");
		System.out.println("Original Object: ");
		e1.getData();
		
		//create another object by cloning e1. As myClone() method returns object of object class type, it should be converted into Employee type.
		Employee e2 = (Employee)e1.myClone();
		System.out.println("Cloned object: ");
		e2.getData();
	}
}

class Employee implements Cloneable{
	//instance vars
	int id;
	String name;
	
	//constructor to initialize vars
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	//method to display the details
	void getData(){
		System.out.println("Id = "+ id);
		System.out.println("Name = "+ name);
	}
	
	//clone the present class object 
	public Object myClone() throws CloneNotSupportedException{
		return super.clone();
	} 
}