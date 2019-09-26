package petrolstation;

public class Station {
    public Station () {
    }
    public int Refill (Car car) {
        int refill = car.capacity;
        car.gas = refill;
        return car.gas;
    }
}
