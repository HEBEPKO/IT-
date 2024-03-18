package exercise2.ex_2_Car;
//        #   1.2) Колеса
//        #   1.2.1) Имеет радиус
//        #   1.2.2) Имеют три варианта сезонности: зимние\летние\всесезонные
//        #   1.2.3) Имеет наименование

public class Wheels {
    private int wheelRadius;
    private String nameWheels;
    private Season seasonality;

    public int getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public String getNameWheels() {
        return nameWheels;
    }

    public void setNameWheels(String nameWheels) {
        this.nameWheels = nameWheels;
    }

    public Season getSeasonality() {
        return seasonality;
    }

    public void setSeasonality(Season seasonality) {
        this.seasonality = seasonality;
    }

    public Wheels(int wheelRadius, String nameWheels, Season seasonality) {
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
