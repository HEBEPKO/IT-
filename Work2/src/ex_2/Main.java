package ex_2;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(1600, "gasoline stamps 95", "Drive E ");
        Car car = new Car(motor, "21", "4", "4");
        car.displayInfo();
    }
}