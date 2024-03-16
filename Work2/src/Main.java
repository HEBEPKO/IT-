public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(1600);
        Car car = new Car(motor, "21", "4", "4");
        car.displayInfo();
    }
}