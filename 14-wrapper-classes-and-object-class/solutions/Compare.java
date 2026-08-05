//5. Write a program where equals() method compares Myclass objects' references. The same equals() method is used to compare Integer class objects' contents.
//equals() method 
public class Compares{
	public static void main(String[] args){
		
		//create two Myclass objects with same content.
		//in this case, references of objects will be different.  	
		Myclass obj1 = new Myclass(11);
		Myclass obj2 = new Myclass(11);
		
		//create two wrapper class objects and store same content.
		//in this case, references of objects will be different. 
		Integer obj3 = Integer.valueOf(11);
		Integer obj4 = Integer.valueOf(11);
		
		if(obj1.equals(obj2)){
			System.out.println("obj1 and obj2 are same");
		}else{
			System.out.println("obj1 and obj2 are not same");
		}
		
		if(obj3.equals(obj4)){
			System.out.println("obj3 and obj4 are same");
		}else{
			System.out.println("obj3 and obj4 are not same");
		}
	}
}

//take Myclass that stores an int value 
class Myclass{
	int x;
	
	Myclass(int x){
		this.x = x;
	}
}