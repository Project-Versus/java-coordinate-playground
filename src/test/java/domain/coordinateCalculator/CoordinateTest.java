package domain.coordinateCalculator;

import domain.Coordinate;
import exception.ExceedRangeException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CoordinateTest {

    @ParameterizedTest
    @CsvSource(value = {"1 , 5", " 1 , 2"}, delimiter = ',')
    @DisplayName("좌표 객체 생성에 대한 테스트")
    void createCoordinate(String x, String y) throws Exception {
        /**
         * 좌표는 근데 x,y축 말고 z축도 생길 수 있지 않을까? 일단 X,Y 축만 생각..
         */
        Coordinate coordinate = new Coordinate(x, y);
        assertThat(coordinate.getX()).isEqualTo(x);
        assertThat(coordinate.getY()).isEqualTo(y);
    }

    @ParameterizedTest
    @CsvSource(value = {"266, 1", " 3 , 26"}, delimiter = ',')
    @DisplayName("좌표 객체 생성 예외 처리")
    void validateCreationCoordinate(String x, String y) {
        assertThatThrownBy(() -> {
            new Coordinate(x, y);
        }).isInstanceOf(ExceedRangeException.class);
    }

}