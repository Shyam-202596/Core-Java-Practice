import java.util.ArrayList;

public class ArrayListApplication {
    public static void main(String[] args) throws java.lang.Exception {
        ArrayList<Employee> arl = new ArrayList<>();
        Employee obj1 = new Employee(11, "Shyam", "Munirka, New Delhi 110067");
        arl.add(obj1);
        Employee obj2 = new Employee(23, "Vaibhav", "Ayodhya, U.P 110068");
        arl.add(obj2);
        Employee obj3 = new Employee(18, "Roushan", "Dehri, Bihar 110069");
        arl.add(obj3);
        Employee obj4 = new Employee(12, "Vikash", "Jagdishpur, Bihar 110066");
        arl.add(obj4);
        Employee obj5 = new Employee(13, "Shashi", "JNU, New Delhi 110065");
        arl.add(obj5);
        for(Employee emp : arl){
            emp.display();
            System.out.println("---------------------------------------------------------");
        }
    }
}
class Employee{
    int id;
    String name;
    String address;
    Employee(int i, String n, String a){
        id = i;
        name = n;
        address = a;
    }
    void display(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}