package domain.coordinateCalculator;

import domain.Coordinate;

import java.util.List;

public class CoordinatesCalculator implements Calculator {

    private final List<Coordinate> coordinates;

    public CoordinatesCalculator(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public double calc() {
        if (coordinates.size() == 0) {
            throw new RuntimeException("좌표를 입력해주세요.");
        }

        double firstXaxis = Double.parseDouble(coordinates.get(0).getX());
        double firstYaxis = Double.parseDouble(coordinates.get(0).getY());
        double secondXaxis = Double.parseDouble(coordinates.get(1).getX());
        double secondYaxis = Double.parseDouble(coordinates.get(1).getY());

        return Math.sqrt(Math.pow((firstXaxis - secondXaxis), 2) + Math.pow(firstYaxis - secondYaxis, 2));
    }
}
