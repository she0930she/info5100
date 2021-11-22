package Q1;

import Q1.Car;

public class CarDecorator implements Car{

    private Car car;

    public CarDecorator(Car car){
        this.car= car;
    }

    @Override
    public void assemble(){
        this.car.assemble();
    }
}
