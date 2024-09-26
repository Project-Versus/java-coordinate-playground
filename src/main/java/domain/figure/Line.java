package domain.figure;

import domain.Coordinate;

public class Line extends Figure {
    private static final String LINE_COORDINATES_EXCEPTION = "선에 대한 좌표는 2개여야 됩니다.";

    public Line(Coordinate[] coordinates) {
        super();
        this.coordinates = coordinates;
    }

    @Override
    public int getLineCount() {
        return 0;
    }

    private void validationLine() {
        if ( coordinates.length != 2 ) {
            throw new RuntimeException(LINE_COORDINATES_EXCEPTION);
        }
    }
}
