package ex3_Array_i_obj;

class Animal {
    String animal;
    private String name;
    String breed;

    public String getName() {
        return name;
    }

    Animal(String animal, String name, String breed) {
        this.animal = animal;
        this.name = name;
        this.breed = breed;
    }
    public void printInfo() {
        System.out.println("Animal: " + animal + "\n Name: " + getName() + ", Breed: " + breed);
    }
}
