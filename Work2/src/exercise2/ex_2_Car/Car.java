package exercise2.ex_2_Car;

import exercise2.ex_2_Driver.Driver;
import exercise2.ex_2_Driver.DriverLicense;

//1. Написать классы на тему "Автомобиль" (несколько классов) с использованием интерфейсов и абстрактных классов. У автомобиля должно быть:
//        #   1.1) Мотор
//        #   1.1.1) Имеет объем
//        #   1.1.2) Хранит информацию о бензине который в него можно заливать
//        #   1.1.3) Имеет наименование
//        #   1.2) Колеса
//        #   1.2.1) Имеет радиус
//        #   1.2.2) Имеют три варианта сезонности: зимние\летние\всесезонные
//        #   1.2.3) Имеет наименование
//        #   1.3) Имеет количество мест
//        #   1.4) Информация о категории прав которые необходимы для управления транспортным средством
//        #   1.5) Имеет замок который можно открыть определенным ключом
public class Car {
    private String motor;
    private String wheels;
    private String numberSeats;
    private License licenseCategories;
    private CarLock carLock;

    public String getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = String.valueOf(motor);
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = String.valueOf(wheels);
    }

    public String getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(NumberSeats numberSeats) {
        this.numberSeats = numberSeats.toString();
    }

    public License getLicenseCategories() {
        return licenseCategories;
    }

    public void setLicenseCategories(License licenseCategories) {
        this.licenseCategories = licenseCategories;
    }

    public CarLock getCarLock() {
        return carLock;
    }

    public int carLockValue() {return carLock.getKEY_CAR_LOCK();}

    public void setCarLock(CarLock carLock) {
        this.carLock = carLock;
    }

    public Car(Motor motor, Wheels wheels, License licenseCategories, NumberSeats numberSeats, CarLock carLock) {
        this.motor = String.valueOf(motor);
        this.wheels = String.valueOf(wheels);
        this.licenseCategories = License.valueOf(String.valueOf(licenseCategories));
        this.numberSeats = String.valueOf(numberSeats);
        this.carLock = carLock;
    }

    public void displayInfo() {
        System.out.println("Car with:");
        System.out.printf("%s %s" + "\nCategories: %s" + "\nNumber of seats: %s",motor,wheels,licenseCategories, numberSeats);
    }

    public License valueLicense(Driver driver){
        return getLicenseCategories();
    }

}
