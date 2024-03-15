package ex3_Array_i_obj;

public class Person {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, String address) {
        setName(name);
        setAddress(address);
    }

    public void trainsAnimal() {
        System.out.println("Command to lie down");
    }

    @Override
    public String toString() {
        return "Person: " +
                "\n name='" + getName() + '\'' + "," +
                "\n address='" + getAddress() + '\'' +
                ";";
    }
}
