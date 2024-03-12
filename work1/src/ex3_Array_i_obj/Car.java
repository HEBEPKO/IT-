package ex3_Array_i_obj;

class Car {
    String brand;
    String model;
    int year_of_issue;
    Car(String brand, String model, int year_of_issue) {
        this.brand = brand;
        this.model = model;
        this.year_of_issue = year_of_issue;
    }
    public void printInfo() {
        System.out.println("Car: " + brand + "\n Model: " + model + "\n Year: " + year_of_issue);
    }
}
