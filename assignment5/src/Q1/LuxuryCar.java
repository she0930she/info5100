package Q1;

import Q1.Car;
import Q1.CarDecorator;

public class LuxuryCar extends CarDecorator {


    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Luxury Car.");
    }

}
