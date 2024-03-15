package ex3_Array_i_obj;

class Animal {
    String animal;
    private String name;
    String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Animal(String animal, String name, String breed) {
        this.animal = animal;
        setName(name);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal:" +
                "\n animal='" + animal + '\'' + "," +
                "\n name='" + name + '\'' + "," +
                "\n breed='" + breed + '\'' +
                ";";
    }
}
