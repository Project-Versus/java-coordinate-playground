package domain.coordinateCalculator;

import domain.Coordinate;
import org.assertj.core.data.Offset;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CoordinatesCalculatorTest {

    @CsvSource(value = {"1 , 5 , 6, 7, 5.3851648071345", " 1 , 2 , 7, 0, 6.3245553203368"}, delimiter = ',')
    @ParameterizedTest
    void calcForCoordinates(String x, String y, String x2, String y2, double result) throws Exception {
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(x, y));
        coordinates.add(new Coordinate(x2, y2));

        CoordinatesCalculator coordinatesCalculator = new CoordinatesCalculator(coordinates);
        double distance = coordinatesCalculator.calc();

        assertThat(distance).isEqualTo(result, Offset.offset(0.009));
    }

}