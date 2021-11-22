package Question1;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        iCar sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println();

        iCar sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
