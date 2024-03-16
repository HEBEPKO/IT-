package ex_2;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(1600, "gasoline stamps 95", "Drive E ");
        Wheels wheels = new Wheels(21, "BrickStun", "WINTER");
        Car car = new Car(motor, wheels, "4", "4");
        car.displayInfo();
    }
}