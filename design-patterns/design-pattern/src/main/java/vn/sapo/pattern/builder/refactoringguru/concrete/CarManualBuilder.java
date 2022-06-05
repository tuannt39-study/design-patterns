package vn.sapo.pattern.builder.refactoringguru.concrete;

import vn.sapo.pattern.builder.refactoringguru.components.Engine;
import vn.sapo.pattern.builder.refactoringguru.components.GPSNavigator;
import vn.sapo.pattern.builder.refactoringguru.components.Transmission;
import vn.sapo.pattern.builder.refactoringguru.components.TripComputer;
import vn.sapo.pattern.builder.refactoringguru.interfacebuilder.Builder;
import vn.sapo.pattern.builder.refactoringguru.product.CarType;
import vn.sapo.pattern.builder.refactoringguru.product.Manual;

public class CarManualBuilder implements Builder {
    private CarType type;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private TripComputer tripComputer;
        private GPSNavigator gpsNavigator;

        @Override
        public void setCarType(CarType type) {
            this.type = type;
        }

        @Override
        public void setSeats(int seats) {
            this.seats = seats;
        }

        @Override
        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        @Override
        public void setTransmission(Transmission transmission) {
            this.transmission = transmission;
        }

        @Override
        public void setTripComputer(TripComputer tripComputer) {
            this.tripComputer = tripComputer;
        }

        @Override
        public void setGPSNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
        }

        public Manual getResult() {
            return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
        }

}
