public class GroupOfObjects {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee(10, "Sachin");
        empArr[1] = new Employee(17, "Abd");
        empArr[2] = new Employee(18, "Virat");
        empArr[3] = new Employee(7, "Mahi");
        empArr[4] = new Employee(45, "Rohit");
        System.out.println("Employee Data is:");
        for(Employee emp : empArr){
            emp.displayData();
        }
    }
}
class Employee{
    //instance variables
    int id;
    String name;
    Employee(int i, String n){
        id = i;
        name = n;
    }
    void displayData(){
        System.out.println(id + "\t" + name);
    }
}
