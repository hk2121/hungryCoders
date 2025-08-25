package engineering_digest.innerclasses;

public class Test {
    public static void main(String[] args) {

//        Car car = new Car("Tata Safari");
//        Engine engine = new Engine(car);
//        engine.start();
//        engine.stop();
//
//        Car car1 = new Car("fortuner");
//        Engine engine1 = new Engine(car1);
//        engine1.start();
//        engine1.stop();
//        Computer computer = new Computer("HP","ABC","XYZ");
//         computer.getOs().displayInfo();

        ShoppingCart shoppingCart = new ShoppingCart(150);
        CreditCard creditCard = new CreditCard("1234");
        shoppingCart.processPayment(creditCard );
    }

}

