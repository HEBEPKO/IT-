package ex_2;
//        #   1.2) Колеса
//        #   1.2.1) Имеет радиус
//        #   1.2.2) Имеют три варианта сезонности: зимние\летние\всесезонные
//        #   1.2.3) Имеет наименование

public class Wheels {
    public int wheelRadius;
    public String nameWheels;
    public String seasonality;

    public Wheels(int wheelRadius, String nameWheels, String seasonality) {
        this.wheelRadius = wheelRadius;
        this.nameWheels = nameWheels;
        this.seasonality = seasonality;
    }

    @Override
    public String toString() {
        return "\nWheels:" +
                "\n wheelRadius='" + wheelRadius + '\'' +
                ", nameWheels='" + nameWheels + '\'' +
                ", seasonality='" + seasonality + '\'' +
                ',';
    }
}
