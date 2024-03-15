package ex3_Array_i_obj;

public class ProgramObj {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = new Person("Aleksei", "Lane Meadow House No. 5");
        objects[1] = new Animal("Dog", "Vincent", "Malinois");
        objects[2] = new Car("Toyota", "LendCruiser", 2021);

        for (Object obj : objects) {
            if (obj instanceof Person person) {
                System.out.println(person);
            } else if (obj instanceof Animal animal) {
                System.out.println("He has \n" + animal);
            } else if (obj instanceof Car car) {
                System.out.println("Owns \n" + car);
            } else {
                System.out.println("Conversion is invalid");
            }
        }
    }
}
