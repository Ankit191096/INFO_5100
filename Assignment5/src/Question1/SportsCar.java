package Question1;

public class SportsCar extends CarDecorator{

    public SportsCar(iCar c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println(" Adding features of Sports Car.");
    }
}
