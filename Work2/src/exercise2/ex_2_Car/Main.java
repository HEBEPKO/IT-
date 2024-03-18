package exercise2.ex_2_Car;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(1600, Fuel.GASOLINE_STAMPS_98, "Drive E");
        Wheels wheels = new Wheels(21, "BrickStun",Season.SUMMER);
        CarLock carLock = new CarLock(1111);
        Car car = new Car(motor, wheels, License.B, NumberSeats.NINE, carLock);
        car.displayInfo();
    }
}