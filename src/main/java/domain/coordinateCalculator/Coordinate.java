package domain.coordinateCalculator;

import domain.exception.ExceedRangeException;

public class Coordinate {
    private final static int MAX_RANGE = 24;
    private int x;
    private int y;

    public Coordinate(int x, int y) throws ExceedRangeException {
        this.x = x;
        this.y = y;
        this.validateCoordinateRage();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private void validateCoordinateRage() throws ExceedRangeException {
        if (x > MAX_RANGE || y > MAX_RANGE) {
            throw new ExceedRangeException();
        }
    }
}
