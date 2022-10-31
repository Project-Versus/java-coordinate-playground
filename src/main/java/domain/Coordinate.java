package domain;

import exception.ExceedRangeException;

public class Coordinate {
    private final static int MAX_RANGE = 24;
    private String  x;
    private String  y;

    public Coordinate(String  x, String  y) throws Exception {
        this.x = x;
        this.y = y;
        this.validateCoordinateRage();
    }

    public String  getX() {
        return x;
    }

    public String  getY() {
        return y;
    }

    private void validateCoordinateRage() throws Exception {
        if (Integer.parseInt(x) > MAX_RANGE || Integer.parseInt(y) > MAX_RANGE) {
            throw new ExceedRangeException();
        }
    }
}
