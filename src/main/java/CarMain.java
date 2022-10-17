import domain.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarMain {

    public static void main(String[] args) {
        CarCompany carCompany = new CarCompany();

        List<Car> carList = Stream.of(new Sonata(150), new K5(260), new Sonata(260), new Avante(300), new K5(390)).collect(Collectors.toList());

        Cars cars = new Cars(carList);

        carCompany.addCars(cars);
        carCompany.generateReport();
    }
}
