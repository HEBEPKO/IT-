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

    @Override
    public String toString() {
        return "Car:" +
                "\n brand='" + brand + '\'' + "" +
                "\n model='" + model + '\'' + "" +
                "\n year of issue='" + year_of_issue + '\'' +
                ";";
    }
}
