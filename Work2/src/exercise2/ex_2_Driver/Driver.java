package exercise2.ex_2_Driver;

//2. Написать класс на тему "Водитель". У водителя должно быть:
//        2.1) Стаж вождения
//        2.2) Возможность указывать права нескольких категорий или отсутствие прав
//        2.3) Иметь или не иметь необходимые ключи для открытия разных автомобилей


import exercise2.ex_2_Car.Car;
import exercise2.ex_2_Car.License;

public class Driver {
    private int drivingStag;
    private DriverLicense driverLicense;
    private DriverKey driverKey;

    public int getDrivingStag() {
        return drivingStag;
    }

    public void setDrivingStag(int drivingStag) {
        this.drivingStag = drivingStag;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public Driver setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
        return null;
    }



    public DriverKey getDriverKey() {
        return driverKey;
    }

    public void setDriverKey(DriverKey driverKey) {
        this.driverKey = driverKey;
    }

    public int getKeyValue(){
        return driverKey.getKeyLock();
    }

    public Driver(int drivingStag, DriverLicense driverLicense, DriverKey driverKey) {
        this.drivingStag = drivingStag;
        this.driverLicense = driverLicense;
        this.driverKey = driverKey;
    }

    @Override
    public String toString() {
        return "Driver:" +
                "\n Driving stag = " + drivingStag +
                "," + "\n Driver license = " + driverLicense +
                "," + "\n DriverKey = " + driverKey + ".";
    }

    public DriverLicense value(Driver driver){
        return driver.getDriverLicense();
    }
    public void licenseDriving() {
        System.out.println("У меня есть водительское удостовирение категории: " + driverLicense);
    }

    public boolean openCar(Car car){
        int carLockValue = car.carLockValue();
        int driverKeyValue = this.driverKey.getKeyLock();
        return carLockValue == driverKeyValue;
    }
}
