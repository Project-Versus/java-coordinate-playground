package domain;

public class Sonata extends Car {
    private static final double DISTANCE_PER_LITER = 10;

    public Sonata(double tripDistance) {
        super();
        this.tripDistance = tripDistance;
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
