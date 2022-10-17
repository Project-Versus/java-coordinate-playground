package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class CarTest {

    @CsvSource({"10", "5"})
    @DisplayName("자동차 객체 생성")
    @ParameterizedTest
    void 자동차_객체_생성(double tripDistance) {

        Car sonata = new Sonata(tripDistance);
        Car k5 = new K5(tripDistance);
        Car avante = new Avante(tripDistance);

        assertThat(sonata).isInstanceOf(Car.class);
        assertThat(k5).isInstanceOf(Car.class);
        assertThat(avante).isInstanceOf(Car.class);
    }

    @CsvSource({"200, 20"})
    @DisplayName("쏘나타 주행 연료 계산")
    @ParameterizedTest
    void 쏘나타_주행_가능_거리(double tripDistance, double quantity) {
        Car sonata = new Sonata(tripDistance);

        assertThat(sonata.getChargeQuantity()).isEqualTo(quantity);
    }

    @DisplayName("자동차 이름")
    @Test
    void 자동차_이름() {
        Car sonata = new Sonata(100);
        System.out.println(sonata.getName());
        assertThat(sonata.getName()).isEqualTo(Sonata.class.getSimpleName());
    }

    @CsvSource(value = {"200/ 100", "100/ 500"}, delimiterString = "/")
    @DisplayName("자동차 여행 거리")
    @ParameterizedTest
    void 자동차_객체_여행_거리_확인(double tripDistance, double test) {
        System.out.println(test);
        Car sonata = new Sonata(tripDistance);
        Car k5 = new K5(tripDistance);
        Car avante = new Avante(tripDistance);

        assertThat(sonata.getTripDistance()).isEqualTo(tripDistance);
        assertThat(k5.getTripDistance()).isEqualTo(tripDistance);
        assertThat(avante.getTripDistance()).isEqualTo(tripDistance);
    }
}