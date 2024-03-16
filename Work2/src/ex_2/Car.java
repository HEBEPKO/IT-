package ex_2;

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
    public String motor;
    public String wheels;
    public String vehicleCapacity;
    public String categoryToManage;
    private int lock;


//    public int getLock() {
//        return lock;
//    }

    public void setLock(int lock) {
        this.lock = lock;
    }

    public Car(Motor motor, String wheels, String vehicleCapacity, String categoryToManage) {
        this.motor = String.valueOf(motor);
        this.wheels = wheels;
        this.vehicleCapacity = vehicleCapacity;
        this.categoryToManage = categoryToManage;
        setLock(lock);

    }

    public void displayInfo() {
        System.out.printf("Car with: \n %s", motor);
    }
}
