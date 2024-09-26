package domain.coordinateCalculator;

import domain.Coordinate;
import domain.figure.Line;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 점선을 x,y 좌표를 입력 받는다.
 */
class LineTest {

    @Test
    void createLine() throws Exception {
        Coordinate[] coordinates = {
                new Coordinate("1", "2"),
                new Coordinate("3", "4")
        };

        Line line = new Line(coordinates);
        assertThat(line.coordinates.length).isEqualTo(2);
    }
}