package vn.sapo.pattern.builder.refactoringguru.director;

import vn.sapo.pattern.builder.refactoringguru.components.Engine;
import vn.sapo.pattern.builder.refactoringguru.components.GPSNavigator;
import vn.sapo.pattern.builder.refactoringguru.components.Transmission;
import vn.sapo.pattern.builder.refactoringguru.components.TripComputer;
import vn.sapo.pattern.builder.refactoringguru.interfacebuilder.Builder;
import vn.sapo.pattern.builder.refactoringguru.product.CarType;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
