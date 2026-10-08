public class ColorEnumDemo {
    //enumeration constant is declared as instance variable
    Color c;
    //initialize the variable 
    ColorEnumDemo(Color c) {
        this.c = c;
    }
    void display(){
        switch(c){
            case RED : System.out.println("Red color"); break;
            case GREEN : System.out.println("Green color"); break;
            case BLUE : System.out.println("Blue color"); break;
            case WHITE : System.out.println("White color"); break;
            default : System.out.println("Not a good color"); 
        }
    }
    public static void main(String[] args) throws java.lang.Exception {
        ColorEnumDemo cd= new ColorEnumDemo(Color.BLACK);
        cd.display();
    }
}
enum Color {
    RED,
    GREEN,
    BLUE,
    WHITE,
    BLACK
}
