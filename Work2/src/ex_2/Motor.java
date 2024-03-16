package ex_2;
//        #   1.1) Мотор
//        #   1.1.1) Имеет объем
//        #   1.1.2) Хранит информацию о бензине который в него можно заливать
//        #   1.1.3) Имеет наименование

public class Motor {
    public int volume;
    public String fuel;
    public String stampsMotor;

    public  Motor(int volume, String fuel, String stampsMotor) {
        this.volume = volume;
        this.fuel = fuel;
        this.stampsMotor = stampsMotor;
    }

    @Override
    public String toString() {
        return "Motor:" +
                "\n volume = " + volume +
                " cubic centimeters, " +
                " fuel = " + fuel +
                " stampsMotor = " + stampsMotor +
                ",";
    }
}
