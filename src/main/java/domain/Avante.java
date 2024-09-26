package domain;

public class Avante extends Car {
    private static final double DISTANCE_PER_LITER = 15;

    public Avante(double tripDistance) {
        super();
        super.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    String getName() {
        return this.carName;
    }
    @Override
    double getChargeQuantity() {
        return super.getChargeQuantity();
    }
}
