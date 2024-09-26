import domain.Coordinate;
import domain.view.GraphView;
import domain.view.InputView;
import domain.view.ResultView;
import domain.coordinateCalculator.*;

import java.util.List;

public class CoordinateMain {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        List<Coordinate> inputCoordinate = inputView.inputCoordinate();

        Calculator calculator = new CoordinatesCalculator(inputCoordinate);
        double distance = calculator.calc();

        ResultView resultView = new ResultView(new GraphView(inputCoordinate), distance);
        resultView.printDistance();
    }
}
