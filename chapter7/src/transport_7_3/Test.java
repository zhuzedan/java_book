package transport_7_3;

public class Test {
    public static void main(String[] args) {
        Vehicle trunk = new Trunk();
        Vehicle car = new Car();
        trunk.startEngine();
        car.startEngine();
        Transport transportTrunk = new Trunk();
        Transport transportCar = new Car();
        transportTrunk.loadCargo(1000);
        transportCar.loadCargo(500);
    }
}
