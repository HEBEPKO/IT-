public class Motor {
    public int volume;

    Motor(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Motor" +
                " volume = " + volume +
                " cubic centimeters" +
                ",";
    }
}
