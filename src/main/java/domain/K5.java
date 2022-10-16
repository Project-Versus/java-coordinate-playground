package domain;

public class K5 extends Car {
    private static final double DISTANCE_PER_LITER = 13;

    public K5(double tripDistance) {
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
