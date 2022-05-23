package inheritance_abstraction;

public class Mercedes extends Car implements LuxuryCar{
    public Mercedes(int year, String make, String model, String color, double price) {
        super(year, "Mercedes", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("START THE ENGINE WITH THE START STOP BUTTON");
    }

    @Override
    public void massage() {
        System.out.println("Welcome to Mercedes");
    }
}
