package ex3_Array_i_obj;

public class Person {
    private String name;
    private String address;

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Person(String name, String address) {

        this.name = name;
    }

    public void trainsAnimal() {
        System.out.println("Command to lie down");
    }

    public void printInfo() {

        System.out.println("Person: " + getName() + "\n Lives at address: " + getAddress());
    }
}
