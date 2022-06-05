package vn.sapo.pattern.builder.refactoringguru.interfacebuilder;

import vn.sapo.pattern.builder.refactoringguru.components.Engine;
import vn.sapo.pattern.builder.refactoringguru.components.GPSNavigator;
import vn.sapo.pattern.builder.refactoringguru.components.Transmission;
import vn.sapo.pattern.builder.refactoringguru.components.TripComputer;
import vn.sapo.pattern.builder.refactoringguru.product.CarType;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
