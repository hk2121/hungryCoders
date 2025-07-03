package engineering_digest;

public class Car {
    String color;
    String brand;
    String model;
    int year;
    int speed;

    public void accelerate(int increment) {
        speed += increment;
    }

    public void brake(int decrement)
    {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.color="Blue";
        car.speed = 40;
        car.brand = "Tata";
        car.year = 2024;
        car.model = "safari";

        car.accelerate(1);
        System.out.println(car.speed);
//        car.brake();
    }
}
