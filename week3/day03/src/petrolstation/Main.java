package petrolstation;

public class Main {
    public static void main(String[] args) {
        Station station = new Station();
        Car car = new Car();
        System.out.println(station.Refill(car));
    }
}
