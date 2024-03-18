package exercise2.ex_2_Driver;

public enum DriverLicense {
    A,B,C,D,NOT_LICENSE;

    @Override
    public String toString() {
        return "License " + super.toString();
    }
}
