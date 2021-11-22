package Question1;

public class CarDecorator implements iCar{

    protected iCar car;

    public CarDecorator(iCar c){
        this.car = c;
    }
    @Override
    public void assemble() {
        this.car.assemble();
    }
}
