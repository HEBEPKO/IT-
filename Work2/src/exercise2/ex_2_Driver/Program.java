package exercise2.ex_2_Driver;

import exercise2.ex_2_Car.*;

public class Program {
    public static void main(String[] args) {
        DriverKey driverKey = new DriverKey(11111);
        Motor motor = new Motor(1600, Fuel.GASOLINE_STAMPS_98, "Drive E");
        Wheels wheels = new Wheels(21, "BrickStun", Season.SUMMER);
        CarLock carLock = new CarLock(11111);
        Car newCar = new Car(motor, wheels, License.B, NumberSeats.NINE,carLock);

        Driver newDriver =
                new Driver(12, DriverLicense.B, driverKey);
        System.out.println(newDriver);
        newDriver.licenseDriving();

        boolean carOPEN = newDriver.openCar(newCar);
        if (carOPEN) {
            System.out.println("Машина открыта");
        } else {
            System.out.println("Ключ не от этого автомобиля");
        }
    }

}
