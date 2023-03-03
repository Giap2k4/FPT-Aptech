package thi;

public class testFlight {
    public static void main(String[] args) {
        Flight f = new Flight(857,"Toronto");
        System.out.println(f.getNumber());
        System.out.println(f.getDestination());
        f.display();
    }
}
