public class PlanetEnumDemo {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("PLANET" + "\t\t" + "DISTANCE(Km)" + "\t\t" + "MASS(Kg)");
        for(Planets p : Planets.values()){
            System.out.print(p + "\t\t");
            System.out.print(p.getDistance() + "\t\t");
            System.out.print(p.getMass() + "\t\t");
            System.out.println();
        }
    }
}
enum Planets{
    Mercury(57910, 3.30e23), Venus(108200, 4.87e24), Earth(149600, 5.98e24), Mars(227940, 6.42e23), Jupiter(778330, 1.90e27);
    private long distance;
    private double mass;
    Planets(long d, double m){
        distance = d;
        mass = m;
    }
    long getDistance(){
        return distance;
    }
    double getMass(){
        return mass;
    }
}
