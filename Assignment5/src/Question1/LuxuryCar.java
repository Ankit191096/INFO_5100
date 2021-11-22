package Question1;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(iCar c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
